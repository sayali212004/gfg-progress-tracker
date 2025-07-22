// User function Template for Java

class Solution {
    int[] constructLowerArray(int[] arr) {
        // code here
        int n = arr.length;
        int[] res = new int[n];
        List<Integer> seen = new ArrayList<>();

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {
            int val = arr[i];

            // Binary search to find the index of first number >= val
            int idx = lowerBound(seen, val);

            // That index is count of smaller elements
            res[i] = idx;

            // Insert val into correct sorted position
            seen.add(idx, val);
        }

        return res;
    }

    // Custom binary search to find index of first number >= val
    private int lowerBound(List<Integer> list, int target) {
        int left = 0, right = list.size();

        while (left < right) {
            int mid = (left + right) / 2;
            if (list.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}