class Solution {
    static ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        // code here
        ArrayList <Integer> result = new ArrayList<>();
        int n=arr.length;
        int maxIndex=-1;
        
        for (int i = 0; i <= n - k; i++) 
        {
            // If current max is out of this window, find new max
            if (maxIndex < i) 
            {
                maxIndex = i;
                for (int j = i + 1; j < i + k; j++) 
                
                {
                    if (arr[j] > arr[maxIndex]) 
                    {
                        maxIndex = j;
                    }
                }
            } 
            else 
            {
                // Compare only new element with current max
                if (arr[i + k - 1] > arr[maxIndex]) 
                {
                    maxIndex = i + k - 1;
                }
            }
            result.add(arr[maxIndex]);
        }
        return result;
    }
}