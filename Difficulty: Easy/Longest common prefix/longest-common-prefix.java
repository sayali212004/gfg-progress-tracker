// User function Template for Java

class Solution {
    public int longestCommonPrefix(String s1, String s2) {
        // code here
        int maxLen=0;
        
        for(int i=0;i<=s1.length();i++)
        {
            String prefix=s1.substring(0,i);
            
            if(s2.contains(prefix))
            {
                maxLen=i;
            }
        }
        
        return maxLen;
    }
}