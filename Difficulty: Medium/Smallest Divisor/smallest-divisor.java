class Solution {
    int smallestDivisor(int[] arr, int k) {
        // Code here
        int low=1;
        int high=getMax(arr);
        int ans=high;
        
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int sum=0;
            
            for(int i=0;i<arr.length;i++)
            {
                sum=sum+(int)Math.ceil((double)arr[i]/mid);
            }
            
            if(sum<=k)
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return ans;
    }
    
    private int getMax(int arr[])
    {
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
}