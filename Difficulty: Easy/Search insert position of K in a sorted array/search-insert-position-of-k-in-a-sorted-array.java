// User function Template for Java

class Solution {
    static int searchInsertK(int Arr[], int N, int k) {
        // code here
        
    
        int low=0;
        int high=N-1;
        
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(Arr[mid]>k)
            {
                high=mid-1;
            }
            else if(Arr[mid]<k)
            {
                low=mid+1;
            }
            else
            {
                return mid;
            }
        }
        return low;
    }
}