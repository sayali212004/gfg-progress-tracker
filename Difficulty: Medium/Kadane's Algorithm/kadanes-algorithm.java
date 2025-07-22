class Solution {
    int maxSubarraySum(int[] arr) {
        // Your code here
        int maxSum=arr[0];
        int currentSubArraySum=arr[0];
        
        for(int i=1;i<arr.length;i++)
        {
            currentSubArraySum=Math.max(arr[i],currentSubArraySum+arr[i]);
            maxSum=Math.max(maxSum,currentSubArraySum);
        }
        return maxSum;
    }
}
