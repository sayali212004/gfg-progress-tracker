// User function Template for Java

class Solution {
    int[][] sortedMatrix(int N, int Mat[][]) {
        // code here
        int rows=Mat.length;
        int cols=Mat[0].length;
        int index=0;
        
        int arr[]=new int [rows*cols];
        
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                arr[index]=Mat[i][j];
                index++;
            }
        }
        
        Arrays.sort(arr);
        
        index =0;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                Mat[i][j]= arr[index];
                index++;
            }
        }
        
        return Mat;
    }
};