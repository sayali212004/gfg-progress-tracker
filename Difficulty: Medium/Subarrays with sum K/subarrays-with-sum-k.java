class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        HashMap <Integer, Integer> map=new HashMap<>();
        
        map.put(0,1);
        int prefixSum=0;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            prefixSum+=arr[i];   
            
            if(map.containsKey(prefixSum-k))
            {
                count=count+map.get(prefixSum-k);
            }
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }
        return count;
        
    }
}