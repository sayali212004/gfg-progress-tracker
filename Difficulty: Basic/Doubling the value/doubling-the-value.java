// User function Template for Java

class Solution {
    long solve(int n, long A[], long b) {
        // Complete this function
        for (int i = 0; i < n; i++) {
            if (A[i] == b) {
                b = b * 2;
            }
        }
        return b;
    }
}