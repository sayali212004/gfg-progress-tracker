// User function Template for Java

class GFG {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        int first= firstOccurance(arr,x);
        int last=LastOccurance(arr,x);
        
        ArrayList <Integer> res=new ArrayList<>();
        res.add(first);
        res.add(last);
        
        return res;
    }
     public static int firstOccurance(int arr[], int x)
        {
            int left=0;
            int right=arr.length-1;
            int ans=-1;
            
            while(left<=right)
            {
                int mid=left+(right-left)/2;
                
                if(arr[mid]==x)
                {
                    ans=mid;
                    right=mid-1;
                }
                else if(arr[mid]<x)
                {
                    left=mid+1;
                }
                else
                {
                    right=mid-1;
                }
            }
            return ans;
        }
        
        public static int LastOccurance(int arr[], int x)
        {
            int left=0;
            int right=arr.length-1;
            int ans=-1;
            
            while(left<=right)
            {
                int mid=left+(right-left)/2;
                
                if(arr[mid]==x)
                {
                    ans=mid;
                    left=mid+1;
                }
                else if(arr[mid]<x)
                {
                    left=mid+1;
                }
                else
                {
                    right=mid-1;
                }
            }
            return ans;
        }
}
