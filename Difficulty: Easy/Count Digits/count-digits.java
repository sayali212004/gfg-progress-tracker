class Solution {
    public int countDigits(int n) {
        // code here
        int count =0;
    if(n==0)
    {
        return 1;
    }
    
    while(n>0)
    {
        count++;
        n=n/10;
    }
    return count;
    }
}
