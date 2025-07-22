// User function Template for Java
class Solution {
    char firstRep(String S) {
        // your code here
        HashMap <Character,Integer> map = new HashMap<>();
        
        char arr[] = S.toCharArray();
        
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        for(int i=0;i<arr.length;i++)
        {
            if(map.get(arr[i])>1)
            {
                return arr[i];
            }
        }
        return '#';
    }
}