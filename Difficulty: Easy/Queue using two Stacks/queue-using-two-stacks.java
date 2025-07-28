// User function Template for Java
class StackQueue {
    Stack <Integer> s1 = new Stack<>();
    Stack <Integer> s2 = new Stack<>();
    
    public void push(int B) 
    {
        s1.push(B);
    }

    public int pop() 
    {
        if(s2.isEmpty())
        {
            while(!s1.isEmpty())
            {
                s2.push(s1.pop());
            }
        }
        
        if(s2.isEmpty())
        {
            return -1;
        }
        return s2.pop();
    }
}