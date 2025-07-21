class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // Using HashSet to remove duplicates
        HashSet<Integer> sh = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            sh.add(a[i]);
        }

        for (int i = 0; i < b.length; i++) {
            sh.add(b[i]);
        }

        // Convert HashSet to ArrayList
        ArrayList<Integer> result = new ArrayList<>(sh);

        // Optional: sort the result
        Collections.sort(result);

        return result;
    }
}
