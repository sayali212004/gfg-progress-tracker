// User function Template for Java

class Solution {
    ArrayList<Integer> bracketNumbers(String str) {
        // code here
        int count=0;
        ArrayList <Integer> res = new ArrayList<>();
        Stack <Integer> stack = new Stack<>();
        
        for(char ch:str.toCharArray())
        {
            if(ch=='(')
            {
                count++; 
                stack.push(count);
                res.add(count);
            }
            else if(ch==')')
            {
                if(!stack.isEmpty())
                {
                    res.add(stack.pop());
                }
            }
        }
        return res;
    }
};