class Solution {
    // Function to find the minimum element in sorted and rotated array.
    static int minNumber(int arr[], int low, int high) {
        // Your code here
        while (low < high) {
            int mid = low + (high - low) / 2;

            // Minimum is in the right half
            if (arr[mid] > arr[high]) {
                low = mid + 1;
            }
            // Minimum is in the left half including mid
            else {
                high = mid;
            }
        }

        // At the end, low == high == index of the smallest element
        return arr[low];
    }
}