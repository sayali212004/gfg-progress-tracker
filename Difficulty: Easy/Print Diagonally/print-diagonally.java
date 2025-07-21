// User function Template for Java

class Solution {
    static ArrayList<Integer> downwardDiagonal(int N, int A[][]) {
        // code here
        ArrayList <Integer> result=new ArrayList<>();
        
        
        for (int col = 0; col < N; col++) {
            int i = 0, j = col;
            while (i < N && j >= 0) {
                result.add(A[i][j]);
                i++;
                j--;
            }
        }
        
        for (int row = 1; row < N; row++) {
            int i = row, j = N - 1;
            while (i < N && j >= 0) {
                result.add(A[i][j]);
                i++;
                j--;
            }
        }
        
        return result;
    }
}
