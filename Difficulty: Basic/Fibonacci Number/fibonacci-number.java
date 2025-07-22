class Solution {
    public static int fibonacci(int n) {
        // Write your code here to calculate
        // to calculate the nth fibonacci number
        if(n<=1)
        {
            return n;
        }
         int a=0;
         int b=1;
         
        for(int i=2;i<=n;i++)
        {
               int temp=a+b;
               a=b;
               b=temp;
        }
        return b;
    }
}
