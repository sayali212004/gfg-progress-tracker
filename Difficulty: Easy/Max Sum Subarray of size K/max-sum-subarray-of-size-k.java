class Solution {
    public int maximumSumSubarray(int[] arr, int k) {
        int n=arr.length;
        if(n<k) return -1;
        
        int windowSum=0;
        
        for(int i=0;i<k;i++)
        {
            windowSum=windowSum+arr[i];
        }
        
        int maxSum=windowSum;
        
        for(int i=k;i<n;i++)
        {
            windowSum= windowSum+arr[i]-arr[i-k];
            maxSum = Math.max(windowSum,maxSum);
        }
        
        // maxSum = Math.max(windowSum,maxSum);
        
        return maxSum;
    }
}