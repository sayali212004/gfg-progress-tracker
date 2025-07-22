// User function Template for Java

class Solution {

    // Complete the function
    // str: input string
    public static boolean isPanagram(String str) {
        // Check if given string is panagram
        str=str.toLowerCase();
        
        boolean result [] = new boolean [26];
        
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i); 
            if(ch>='a' && ch<='z')
            {
                result[ch-'a']= true;
            }
        }
        
        for(int i=0;i<26;i++)
        {
            if(!result[i])
            {
                return false;
            }
        }
        return true;
        
    }
}