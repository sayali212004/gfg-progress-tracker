// User function Template for Java

class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        int n=arr.size();
        
        if(m==0||n==0) return 0;
        
        Collections.sort(arr);
        int minDiff=Integer.MAX_VALUE;
        for(int i=0;i<n-m+1;i++)
        {
            int diff = arr.get(i + m - 1) - arr.get(i);

            minDiff=Math.min(minDiff,diff);
        }
        return minDiff;
    }
}