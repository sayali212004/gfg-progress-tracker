// User function Template for Java

class Solution {
    public void immediateSmaller(int arr[]) {
        // code here
        int n=arr.length;
        // int prev=-1;
        // int res[]=new int[n];
        
        for(int i=0;i<n-1;i++)
        {
            if(arr[i+1]<arr[i])
            {
                arr[i]=arr[i+1];
            }
            else
            {
                arr[i]=-1;
            }
        }
        arr[n-1]=-1;
    }
}