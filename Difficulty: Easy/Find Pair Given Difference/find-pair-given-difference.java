
class Solution {
    public boolean findPair(int[] arr, int x) {
        // code here
        int n =arr.length;
        if (x == 0) {
            HashMap<Integer, Integer> freq = new HashMap<>();
            for (int i=0;i<n;i++)
            {
                freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
                if (freq.get(arr[i]) > 1) {
                    return true;
                }
            }
            return false;
        }

        // General case: x > 0
        HashSet<Integer> set = new HashSet<>();
        for (int i=0;i<n;i++) {
            set.add(arr[i]);
        }

        for (int i=0;i<n;i++) {
            if (set.contains(arr[i] + x)) {
                return true;
            }
        }

        return false;
    }
}
