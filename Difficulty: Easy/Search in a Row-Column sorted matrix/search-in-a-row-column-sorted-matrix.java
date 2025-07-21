class Solution {
    public static boolean matSearch(int mat[][], int x) {
        // your code here
        int i=0;
        int j=mat[0].length-1;
        
        while(i<mat.length && j>=0)
        {
            if(mat[i][j]==x)
            {
                return true;
            }
            else if (mat[i][j]>x)
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        return false;
    }
}