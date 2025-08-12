class Solution {
    void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        int j=0;
        
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                arr[j]=arr[i];
                j++;
            }
        }
        
        while(j<arr.length)
        {
            arr[j]=0;
            j++;
        }
    }
}