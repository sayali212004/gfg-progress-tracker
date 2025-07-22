class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        // code here
        int n=matrix.length;
        int m=matrix[0].length;
        
        int arr[]=new int [n*m];
        int index=0;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[index]=matrix[i][j]; 
                index++;
            }
        }
        
        Arrays.sort(arr);
        int ans=0;
        
        for(int i=0;i<arr.length;i++)
        {
            ans=arr[k-1];
        }
        return ans;
    }
}