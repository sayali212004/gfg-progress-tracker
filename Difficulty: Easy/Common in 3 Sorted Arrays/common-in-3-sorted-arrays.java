// User function Template for Java

class Solution {
    // Function to find common elements in three arrays.
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
        // Code Here
        int i=0, j=0,k=0;
        // int prev=0;
        
        ArrayList <Integer> result = new ArrayList<>();
        
        
        while(i<arr1.size() && j<arr2.size() && k<arr3.size())
        {
            
            while(i>0 && i<arr1.size() && arr1.get(i)==arr1.get(i-1))
            {
                i++;
            }
            while(j>0 && j<arr2.size() && arr2.get(j)==arr2.get(j-1))
            {
                j++;
            }
            while(k>0 && k<arr3.size() && arr3.get(k)==arr3.get(k-1))
            {
                k++;
            }
            
            if (i >= arr1.size() || j >= arr2.size() || k >= arr3.size()) break;
        
            int a=arr1.get(i);
            int b=arr2.get(j);
            int c=arr3.get(k);
            
            if(a==b && b==c)
            {
                if(result.isEmpty()||a!=result.get(result.size()-1))
                {
                    result.add(a);
                }
                i++;
                j++;
                k++;
            }
            else if(a<b)
            {
                i++;
            }
            else if(b<c)
            {
                j++;
            }
            else
            {
                k++;
            }
        }
        
        if(result.isEmpty())
        {
            result.add(-1);
        }
        return result;
    }
}