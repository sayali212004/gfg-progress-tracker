class Solution {
    public String reverseWords(String s) {
        // Split the string using dot as delimiter
        String[] words = s.split("\\.");
        StringBuilder sb = new StringBuilder();

        // Loop in reverse and skip empty strings
        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].isEmpty()) {
                sb.append(words[i]);

                // Check if there’s a non-empty word before this
                int j = i - 1;
                while (j >= 0 && words[j].isEmpty()) {
                    j--;
                }

                if (j >= 0) {
                    sb.append(".");
                }
            }
        }

        return sb.toString();
    }
}
