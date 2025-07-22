// User function Template for Java

class Solution {
    // Complete the function
    // str: input string
    public static int countWords(String str) {
        // find and return the number of words
        // present in the string
        int count=0;
        
        if(str.trim().isEmpty())return 0;
        
        return str.trim().split("\\s+").length;
    }
}