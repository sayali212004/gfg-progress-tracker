class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if(s1.length()!=s2.length())
        {
            return false;
        }
        
        char [] arr1=s1.toCharArray();
        char [] arr2=s2.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        return Arrays.equals(arr1,arr2);
    }
}