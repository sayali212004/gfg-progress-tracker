// User function Template for Java

class Solution {
    String removeDuplicates(String s) 
    {
        HashSet <Character> seen = new HashSet <>();
        StringBuilder sb = new StringBuilder ();
        
        for(char ch : s.toCharArray())
        {
            if(!seen.contains(ch))
            {
                seen.add(ch);
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
