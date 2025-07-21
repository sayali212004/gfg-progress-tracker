import java.math.BigInteger;
class Solution {
    public static BigInteger factorial(int n) {
        // code here
        BigInteger res= BigInteger.ONE;
        
        for(int i=2;i<=n;i++)
        {
            res=res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
}
