// User function Template for Java

import java.math.BigInteger;
import java.util.ArrayList;

class Solution {
    public static ArrayList<Integer> factorial(int n) {
        BigInteger fact = BigInteger.ONE;

        // Calculate factorial using BigInteger
        for (int i = 2; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }

        // Convert result to list of digits
        ArrayList<Integer> digits = new ArrayList<>();
        for (char c : fact.toString().toCharArray()) {
            digits.add(c - '0');  // convert character to digit
        }

        return digits;
    }
}
