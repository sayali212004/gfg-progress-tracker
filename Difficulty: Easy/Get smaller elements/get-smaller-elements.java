class Solution {
    public static ArrayList<Integer> getSmaller(int arr[], int target) {
        // write your code here
        ArrayList smoll=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<target)
            {
                smoll.add(arr[i]);
            }
            // smoll.add(arr[i]);
        }
        return smoll;
    }
}