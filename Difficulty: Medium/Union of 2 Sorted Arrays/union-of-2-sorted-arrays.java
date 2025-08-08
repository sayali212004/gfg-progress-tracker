class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        int i=0;
        int j=0;
        int n= a.length;
        int m= b.length;
        
        ArrayList <Integer> result = new ArrayList <>();
        while(i<n && j<m)
        {
            if(a[i]<b[j])
            {
                if(result.isEmpty()||result.get(result.size()-1)!=a[i])
                {
                    result.add(a[i]);
                }
                i++;
            }
            else if(a[i]>b[j])
            {
                if(result.isEmpty()||result.get(result.size()-1)!=b[j])
                {
                    result.add(b[j]);
                }
                j++;
            }
            else
            {
                if(result.isEmpty()||result.get(result.size()-1)!=b[j])
                {   
                    result.add(a[i]);
                }
                i++;
                j++;
            }
        }
        
        while(i<n)
        {
            if(result.isEmpty()||result.get(result.size()-1)!=a[i])
            {
                result.add(a[i]);
            }
            i++;
            
        }
        
        while(j<m)
        {
            if(result.isEmpty()||result.get(result.size()-1)!=b[j])
            {
                result.add(b[j]);
            }
             j++;   
        }
        
        return result;
    }
}
