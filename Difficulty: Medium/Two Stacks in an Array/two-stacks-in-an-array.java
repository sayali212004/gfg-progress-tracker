class twoStacks {
    twoStacks() {}

    // Function to push an integer into the stack1.
    Stack <Integer> stack1 = new Stack<>();
    Stack <Integer> stack2 = new Stack<>();
    
    void push1(int x) {
        // code here
        stack1.push(x);
    }

    // Function to push an integer into the stack2.
    void push2(int x) {
        // code here
        stack2.push(x);
    }

    // Function to remove an element from top of the stack1.
        
    int pop1() {
        // code here
        if(!stack1.isEmpty())
        {
            return (stack1.pop());
        }
        else
        {
            return -1;
        }
    }

        
    // Function to remove an element from top of the stack2.
    int pop2() {
        // code here
        if(!stack2.isEmpty())
        {
            return (stack2.pop());
        }
        else
        {
            return -1;
        }
        
    }
}