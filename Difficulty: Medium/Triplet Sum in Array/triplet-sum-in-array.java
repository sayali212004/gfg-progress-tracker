// User function Template for Java

class Solution {
    // Should return true if there is a triplet with sum equal
    // to x in arr[], otherwise false
    public static boolean hasTripletSum(int arr[], int target) {
        // Your code Here
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {
            int left=i+1;
            int right=n-1;
            
            while(left<right)
            {
                int sum=arr[i]+arr[left]+arr[right];
                
                if(sum==target)
                {
                    return true;
                }
                else if(sum>target)
                {
                    right--;
                }
                else
                {
                    left++;
                }
            }
        }
        return false;
    }
}
