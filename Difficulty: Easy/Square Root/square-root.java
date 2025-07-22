/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution {
    int floorSqrt(int n) {
        // Your code here
        if(n==0||n==1)
        {
            return n;
        }
        int left=0;
        int right=n;
        int ans=0;
        
        while(left<=right)
        {
            int mid=left+(right-left)/n;
            
            if(mid<=n/mid)
            {
                ans=mid;
                left= mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        
        return ans;
    }
}