class Solution {
    public String reverse(String S) {
        // code here
        Stack <Character> stack = new Stack ();
        for(char ch:S.toCharArray())
        {
            stack.push(ch);
        }
        StringBuilder sb = new StringBuilder();
        
        while(!stack.isEmpty())
        {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}