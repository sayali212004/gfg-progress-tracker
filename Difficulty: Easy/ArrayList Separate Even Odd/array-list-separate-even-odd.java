class Solution {
    public static ArrayList<ArrayList<Integer>> evenOdd(ArrayList<Integer> list) {
        
        ArrayList<Integer> evenNum = new ArrayList<>();
        ArrayList<Integer> oddNum = new ArrayList<>();

        for (int num : list) {
            if (num % 2 == 0) {
                evenNum.add(num);
            } else {
                oddNum.add(num);
            }
        }

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        res.add(evenNum);
        res.add(oddNum);

        return res;
    }
}
