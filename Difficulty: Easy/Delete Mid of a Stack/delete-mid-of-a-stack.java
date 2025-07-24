// User function Template for Java

class Solution {
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s) {
        // code here
        int n= s.size();
        int mid=n-(n+1)/2+1;
        
        removemid(s, mid);
    }
    
    private void removemid(Stack<Integer>s, int mid)
    {
        if(mid==1)
        {
            s.pop();
            return;
        }
        
        int temp=s.pop();
        removemid(s,mid-1);
        s.push(temp);
    }
}
