

class Solution {
    Stack<Integer> stack;
    Stack<Integer> minStack;
    public Solution() {
         stack = new Stack<>();
        minStack = new Stack<>();
    }
    

    // Add an element to the top of Stack
    public void push(int x) {
        // code here
        stack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    // Remove the top element from the Stack
    public void pop() {
        // code here
        if (!stack.isEmpty()) {
            int removed = stack.pop();
            if (removed == minStack.peek()) {
                minStack.pop();
            }
        }
    }

    // Returns top element of the Stack
    public int peek() {
        // code here
        return stack.isEmpty() ? -1 : stack.peek();
    }

    // Finds minimum element of Stack
    public int getMin() {
        // code here
        return minStack.isEmpty() ? -1 : minStack.peek();
    }
}