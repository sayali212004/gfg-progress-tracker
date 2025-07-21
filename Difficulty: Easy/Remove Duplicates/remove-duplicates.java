// User function Template for Java

class Solution {
    String removeDups(String s) {
        // code here
        // int [] charArr= s.toCharArray();
        HashSet <Character> sh = new HashSet <>();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(!sh.contains(c))
            {
                sh.add(c);
                sb.append(c);
            }
        }
        return sb.toString();
        
    }
}