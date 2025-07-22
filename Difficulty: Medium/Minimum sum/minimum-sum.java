class Solution {
    public String minSum(int[] arr) {
        int[] count = new int[10];

        // Step 1: Count frequency of each digit
        for (int digit : arr) {
            count[digit]++;
        }

        // Step 2: Build two numbers as strings alternately
        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();
        boolean turn = true; // true → num1, false → num2

        for (int digit = 0; digit <= 9; digit++) {
            while (count[digit] > 0) {
                if (turn) {
                    num1.append(digit);
                } else {
                    num2.append(digit);
                }
                turn = !turn;
                count[digit]--;
            }
        }

        // Step 3: Add num1 + num2 manually
        return addStrings(num1.toString(), num2.toString());
    }

    // Manual string addition to avoid BigInteger
    private String addStrings(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = (i >= 0) ? a.charAt(i--) - '0' : 0;
            int digit2 = (j >= 0) ? b.charAt(j--) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            result.append(sum % 10);
            carry = sum / 10;
        }

        // Remove leading zeroes if any (though we build from smallest digits, so unlikely)
        while (result.length() > 1 && result.charAt(result.length() - 1) == '0') {
            result.setLength(result.length() - 1);
        }

        return result.reverse().toString();
    }
}
