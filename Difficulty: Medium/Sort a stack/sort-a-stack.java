/*Complete the function below*/
class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        if(!s.isEmpty())
        {
            int top=s.pop();
            sort(s);
            insertInOrder(s,top);
        }
        return s;
    }
    
    private static void insertInOrder(Stack <Integer> s,int element)
    {
        if(s.isEmpty()||s.peek()<=element)
        {
            s.push(element);
        }
        else
        {
            int top=s.pop();
            insertInOrder(s,element);
            s.push(top);
        }
    }
}