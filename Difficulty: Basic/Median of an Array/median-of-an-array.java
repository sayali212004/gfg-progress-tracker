class Solution {
    public double findMedian(int[] arr) {
        // Code here.
        Arrays.sort(arr);
        int n=arr.length;
        double ans=0;
        if(n%2==0)
        {
            ans = (arr[n/2 - 1] + arr[n/2]) / 2.0;
        }
        else
        {
              ans=arr[n/2];
        }
        return ans;
    }
}
