class Solution {

    public int peakElement(int[] arr) {
        // code here
        int n=arr.length;
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            boolean left = (mid == 0 || arr[mid] > arr[mid - 1]);
            boolean right = (mid == n - 1 || arr[mid] > arr[mid + 1]);

            if (left && right) {
                return mid; // found a peak
            } else if (arr[mid] < arr[mid + 1]) {
                low = mid + 1; // move right
            } else {
                high = mid - 1; // move left
            }
        }

        return -1; 
    }
}