class Solution {
    int missingNum(int arr[]) {
        // code here
        Arrays.sort(arr);
        int ans=arr.length + 1; 
        for(int i=0;i<arr.length;i++)
        {
            if((i+1)!=arr[i])
            {
                ans=i+1;
                break;
            }
        }
        return ans;
    }
}