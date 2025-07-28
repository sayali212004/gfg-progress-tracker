class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        if (q.size() < k || k <= 0) return q;
        
        Stack <Integer> stack = new Stack <>();
        
        for(int i=0;i<k;i++)
        {
            stack.push(q.remove());
        }
        
        while(!stack.isEmpty())
        {
            q.add(stack.pop());
        }
        
        int remaining = q.size()-k;
        for(int i=0;i<remaining;i++)
        {
            q.add(q.remove());
        }
        return q;
    }
}