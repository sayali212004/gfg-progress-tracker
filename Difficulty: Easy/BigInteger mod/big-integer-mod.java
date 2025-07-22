/*
 * Class MathematicalOperation with mod function
 * a, b : Two parameters of BigIntegers to find mod
 */
import java.math.BigInteger;

class MathematicalOperation {

    // mod function to find the modulus of b by a
    static BigInteger mod(BigInteger a, BigInteger b) {
        // Your Code here
        return b.mod(a);
    }
}