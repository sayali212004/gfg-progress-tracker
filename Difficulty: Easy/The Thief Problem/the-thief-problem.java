class Solution {
    public int getMaxVal(List<Integer> arr, int k) {
        // code here
        Collections.sort(arr);
        
        int n=arr.size();
        int sum=0;
        for(int i=n-1;i>=n-k;i--)
        {
            sum=sum+arr.get(i);
        }
        return sum;
    }
}