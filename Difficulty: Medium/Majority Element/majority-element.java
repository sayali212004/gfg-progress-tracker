class Solution {
    int majorityElement(int arr[]) {
        // code here
        int n=arr.length;
        
        HashMap<Integer, Integer> freq = new HashMap <>();
        
        for(int i=0;i<n;i++)
        {
            freq.put(arr[i],freq.getOrDefault(arr[i],0)+1);
        }
        
        for(int j:freq.keySet())
        {
            if(freq.get(j)>(n/2))
            {
                return j;
            }
        }
        return -1;
    }
}