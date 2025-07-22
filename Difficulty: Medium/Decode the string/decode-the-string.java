


class Solution {
    static String decodeString(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ']') {
                String temp = "";
                
                while (!st.isEmpty() && st.peek() != '[') {
                    temp = st.pop() + temp;
                }
                
                st.pop(); // Remove '['
                
                String num = "";
                while (!st.isEmpty() && Character.isDigit(st.peek())) {
                    num = st.pop() + num;
                }
                
                int count = Integer.parseInt(num);
                String expanded = temp.repeat(count);
                
                for (char c : expanded.toCharArray()) {
                    st.push(c);
                }
            } else {
                st.push(s.charAt(i));
            }
        }
        
        StringBuilder result = new StringBuilder();
        while (!st.isEmpty()) {
            result.insert(0, st.pop());
        }
        
        return result.toString();
    }
}