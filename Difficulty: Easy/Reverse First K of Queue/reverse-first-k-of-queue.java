class GfG {
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // code here.
        Stack <Integer> stack = new Stack <>();
        
        for(int  i=0; i<k;i++)
        {
            stack.push(q.poll());    
        }
        
        while(!stack.isEmpty())
        {
            q.add(stack.pop());
        }
        
        int remaining = q.size()-k;
        for(int i=0;i<remaining;i++)
        {
            q.add(q.poll());
        }
        
        return q;
    }
}