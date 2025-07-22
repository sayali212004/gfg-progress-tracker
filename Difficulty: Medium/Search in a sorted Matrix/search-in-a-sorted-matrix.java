

class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int rows=mat.length;
        int cols=mat[0].length;
        
        int [] arr= new int[rows*cols];
        int index=0;
        
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                arr[index]=mat[i][j];
                index++;
            }
        }
        
        int low=0;
        int high=arr.length-1;
        
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            
            if(arr[mid]==x)
            {
                return true;
            }
            else if(arr[mid]>x)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return false;
    }
}
