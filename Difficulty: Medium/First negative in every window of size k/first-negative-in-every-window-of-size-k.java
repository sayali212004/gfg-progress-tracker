import java.util.*;

class Solution 
{
    static List<Integer> firstNegInt(int arr[], int k) 
    {
        List<Integer> result = new ArrayList<>();
        int n = arr.length;
        int firstNegIndex = 0;

        for (int start = 0; start <= n - k; start++) 
        {
            int end = start + k - 1;

            // Move firstNegIndex to be inside the current window and pointing to a negative number
            while (firstNegIndex < start || (firstNegIndex <= end && arr[firstNegIndex] >= 0)) 
            {
                firstNegIndex++;
            }

            if (firstNegIndex <= end && arr[firstNegIndex] < 0) 
            {
                result.add(arr[firstNegIndex]);
            } else {
                result.add(0);
            }
        }

        return result;
    }
}
