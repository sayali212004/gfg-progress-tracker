/*Complete the function below*/
class Solution {
    public int findExtra(int a[], int b[]) {
        // add code here.
        int i=0;
        
        while (i < b.length) {
            if (a[i] != b[i]) {
                return i;  
            }
            i++;
        }
        
        return a.length - 1;
    }
}