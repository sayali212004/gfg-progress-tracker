// User function Template for Java

class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int n=arr.length;
        int missing=-1;
        int repeating=-1;
        
        int freq []= new int [n+1];
        for (int i = 0; i < n; i++) {
            int val = arr[i];
            freq[val]++;
        }
        
        for(int i=1;i<=n;i++)
        {
            if(freq[i]==0)
            {
                missing=i;
            }
            else if(freq[i]==2)
            {
                repeating=i;
            }
        }
        ArrayList al=new ArrayList<>();
        al.add(repeating);
        al.add(missing);
        
        return al;
    }
}
