// User function Template for Java
import java.util.*;
class Solution {
    public static int aggressiveCows(int[] stalls, int k) {
        int n=stalls.length;
        
        Arrays.sort(stalls);
        int low=1;
        int high=stalls[n-1]-stalls[0];
        int ans=0;
        
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            
            if(canPlaceCows(stalls,k,mid))
            {
                ans=mid;
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return ans;
    }
    
    private static boolean canPlaceCows(int stalls [], int k, int minDist)
    {
        int count=1;
        int lastplaced=stalls[0];
        
        for(int i=0;i<stalls.length;i++)
        {
            if(stalls[i]-lastplaced>=minDist)
            {
                count++;
                lastplaced=stalls[i];
                if(count==k)
                    return true;
            }
            
        }
        return false;
    }
}