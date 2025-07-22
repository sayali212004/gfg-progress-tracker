class Solution {
  public:
    // Function to find transpose of a matrix.
    void transpose(int mat[4][4]) {
        // code here
        for(int i=0;i<4;i++)
        {
            for(int j=i+1;j<4;j++)
            {
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
    }
};