// User function Template for Java

class Solution {
    int median(int mat[][]) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        int arr[]=new int [n*m];
        int index=0;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[index]=mat[i][j];
                index++;
            }
        }
        
        Arrays.sort(arr);
        int len=arr.length;
        int ans=0;
        
        if(len%2==0)
        {
            ans= (arr[len/2]+arr[(len/2)-1])/2;
        }
        
        else
        {
            ans= arr[(len-1)/2];
            
        }
        return ans;
    }
}