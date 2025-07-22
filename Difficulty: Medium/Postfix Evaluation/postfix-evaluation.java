

class Solution {
    public int evaluate(String[] arr) {
        // code here
        Stack<Integer>st=new Stack<>();
        
        for(String ele: arr)
        {
            if(isOperator(ele))
            {
                int b=st.pop();
                int a=st.pop();
                
                // st.push(applyOperation(a,b,ele));
                st.push(applyOperation(a, b, ele));
            }
            else
            {
                st.push(Integer.parseInt(ele));
            }
        }
        return st.pop();
    }
    
    
    private boolean isOperator(String ele)
    {
        return ele.equals("+")||ele.equals("-")||ele.equals("*")||ele.equals("/");
    }
    
    private int applyOperation(int a, int b, String Operator)
    
    {
        switch (Operator)
        {
            case "+": return a+b;
            case "-": return a-b;
            case "*": return a*b;
            case "/": return a/b;
            default: throw new IllegalArgumentException("Invalid operator: " + Operator);
        }
    }
}

