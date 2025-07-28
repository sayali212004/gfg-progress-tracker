// User function Template for Java
class Solution {
    public void enqueue(Queue<Integer> q, int x) {
        // code here
        q.add(x);
    }

    public void dequeue(Queue<Integer> q) {
        // code here
        // if(q.size()<1)
        // return -1;
        q.remove();
        
    }

        
    public int front(Queue<Integer> q) {
        // code here
        return q.peek();
    }
        

    public boolean find(Queue<Integer> q, int x) {
        // code here
        if(q.contains(x))
        return true;
        
        else
        return false;
    }
}