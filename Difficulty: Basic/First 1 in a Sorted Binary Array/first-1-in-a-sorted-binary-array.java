// User function Template for Java

class Solution {

    public long firstIndex(int arr[]) {
        // Your code goes here
        int left=0;
        int right=arr.length-1;
        int temp=-1;
        
        while(left<=right)
        {
            int mid = left+(right-left)/2;
            
            if(arr[mid]==1)
            {
                temp=mid;
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }
        return temp;
    }
}