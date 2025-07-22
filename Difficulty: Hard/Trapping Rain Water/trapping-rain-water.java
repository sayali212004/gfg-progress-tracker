class Solution {
    public int maxWater(int arr[]) {
        // code here
        int n =arr.length;
        int [] leftMax=new int[n];
        int [] rightMax=new int [n];
        
        leftMax[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            leftMax[i]=Math.max(arr[i],leftMax[i-1]);
        }
        
        rightMax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rightMax[i]=Math.max(arr[i],rightMax[i+1]);
        }
        
        int water=0;
        for(int i=0;i<n;i++)
        {
            water=water+(Math.min(rightMax[i],leftMax[i])-arr[i]);
        }
        return water;
    }
}
