class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        boolean spaceSeen = false;

        for (char ch : s.toCharArray()) {
            if (ch != ' ') {
                stack.push(ch);
                spaceSeen = false;
            } else {
                if (!spaceSeen) {
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(' ');
                    spaceSeen = true; // prevent multiple spaces
                }
            }
        }

        // Last word
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString().trim();
    }
}
