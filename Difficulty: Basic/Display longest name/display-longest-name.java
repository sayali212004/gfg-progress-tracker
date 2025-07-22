
class Solution {
    public String longest(List<String> arr) {
        // code here
        if (arr == null || arr.size() == 0) return "";
        
        String longest_name = arr.get(0);
       
        for(int i=1;i<arr.size();i++)
        {
            if(arr.get(i).length()>longest_name.length())
            {
                longest_name=arr.get(i);
            }
        }
        return longest_name;
    }
}
