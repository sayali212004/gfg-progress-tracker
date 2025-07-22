// User function Template for Java

class Solution {
    public List<Integer> valueEqualToIndex(List<Integer> nums) {
        // code here
        ArrayList <Integer> result = new ArrayList <>(); 
        int n=nums.size();
        for(int i=0;i<n;i++)
        {
            if(nums.get(i)==i+1)
            result.add(nums.get(i));
        }
        return result;
    }
}