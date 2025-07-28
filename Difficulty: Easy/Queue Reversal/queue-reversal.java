class Solution {
    // Function to reverse the queue.
    public Queue<Integer> reverseQueue(Queue<Integer> queue) {
        // code here.
        Stack <Integer> stack = new Stack<>();
        
        while(!queue.isEmpty())
        {
            stack.push(queue.remove());
        }
        
        while(!stack.isEmpty())
        {
            queue.add(stack.pop());
        }
        return queue;
    }
}