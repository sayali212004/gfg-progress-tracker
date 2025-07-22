
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        HashMap <Integer,Integer> sh= new HashMap <>();
        
        for(int i=0;i<a.length;i++)
        {
            sh.put(a[i],sh.getOrDefault(a[i],0)+1);
        }
        
        for(int i=0;i<b.length;i++)
        {
            if(!sh.containsKey(b[i])||sh.get(b[i])==0)
            {
                return false;
            }
            sh.put(b[i],sh.get(b[i])-1);
            
        }
        return true;
        
    }
}
