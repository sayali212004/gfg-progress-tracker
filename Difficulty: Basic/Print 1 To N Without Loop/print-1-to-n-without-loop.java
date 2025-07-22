class Solution {
    public void printNos(int n) {
        // Code here
        if(n>0)
        {
            printNos(n-1);
            System.out.print(n+" ");    
        }
        return;
    }
}
