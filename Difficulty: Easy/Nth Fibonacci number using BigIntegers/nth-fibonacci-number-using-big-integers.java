import java.math.BigInteger;
class Solution {
    public static BigInteger fib(int n) {
        // code here
        if(n==0) return BigInteger.ZERO;
        if(n==1) return BigInteger.ONE;
        
        BigInteger a= BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        BigInteger c= BigInteger.ZERO;
        
        for(int i=2;i<=n;i++)
        {
            c=a.add(b);
            a=b;
            b=c;
        }
        return c;
    }
}