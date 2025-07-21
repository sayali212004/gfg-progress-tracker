import requests
from datetime import datetime
import re

USERNAME = "shetesayhn1w"
GFG_PROFILE_URL = f"https://www.geeksforgeeks.org/user/{USERNAME}/"

def fetch_gfg_stats():
    headers = {
        "User-Agent": "Mozilla/5.0"
    }
    resp = requests.get(GFG_PROFILE_URL, headers=headers)
    if resp.status_code != 200:
        print("Failed to fetch profile")
        return None

    html = resp.text

    # Extract total solved problems
    total_solved_match = re.search(r"Total Problems Solved\s*<\/h3>\s*<h3.*?>(\d+)<\/h3>", html, re.DOTALL)
    total_solved = total_solved_match.group(1) if total_solved_match else "N/A"

    # Extract today's solved count (usually shown on profile, fallback if not found)
    today_solved_match = re.search(r"Problems Solved Today\s*<\/h3>\s*<h3.*?>(\d+)<\/h3>", html, re.DOTALL)
    today_solved = today_solved_match.group(1) if today_solved_match else "0"

    # Extract top topics practiced
    topics_match = re.findall(r'<div class="progress-title">([^<]+)<\/div>', html)
    topics = ", ".join(topics_match[:5]) if topics_match else "N/A"

    return {
        "total_solved": total_solved,
        "today_solved": today_solved,
        "topics": topics,
        "profile_url": GFG_PROFILE_URL
    }

def write_progress_md(stats):
    content = f"""\
### 📊 GeeksforGeeks Progress (auto-updated)

- ✅ Total Problems Solved: {stats['total_solved']}
- 📅 Problems Solved Today: {stats['today_solved']}
- 🧠 Topics Practiced: {stats['topics']}
- 🔗 [View My GFG Profile]({stats['profile_url']})

*Last updated: {datetime.utcnow().strftime('%Y-%m-%d %H:%M UTC')}*
"""
    with open("gfg-progress.md", "w") as f:
        f.write(content)

def main():
    stats = fetch_gfg_stats()
    if stats:
        write_progress_md(stats)
    else:
        print("Could not update stats")

if __name__ == "__main__":
    main()

