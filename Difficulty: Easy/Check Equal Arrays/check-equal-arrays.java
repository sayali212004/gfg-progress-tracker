// User function Template for Java

class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        // Your code here
        Arrays.sort(a);
        Arrays.sort(b);
        
        HashMap <Integer,Integer> sh = new HashMap<>(); 
        
        for(int i=0;i<a.length;i++)
        {
            sh.put(a[i],sh.getOrDefault(a[i],0)+1);
        }
        
        for(int i=0;i<b.length;i++)
        {
            sh.put(b[i],sh.getOrDefault(b[i],0)-1);
        }
        
        for(int num : sh.values())
        if(num!=0)
        {
            return false;
        }
        return true;
    }
}