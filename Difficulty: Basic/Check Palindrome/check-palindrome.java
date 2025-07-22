// User function Template for Java
class Solution {
    // function to check if s is palindrome
    // It should return true is the given
    // string is palindrome otherwise false
    public static boolean isPalindrome(String s) {
        // code here
        String str=s.toLowerCase();
    
        int left=0;
        int right=str.length()-1;
    
        if(str.length()<=1)
        {
            return true;
        }
             
        while(left<right)
        {
            if(str.charAt(left)==str.charAt(right))
            {
                return true;
            }
            left++;
            right--;
        }
        return false;
    }
}