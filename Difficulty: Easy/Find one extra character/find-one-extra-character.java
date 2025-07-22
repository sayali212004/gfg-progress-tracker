// User function Template for Java
class Solution {
    public static char extraChar(String s1, String s2) {

        // write your code here
        HashMap <Character, Integer>sh = new HashMap<>();
        
        for(int i=0;i<s1.length();i++)
        {
            char ch = s1.charAt(i);
            sh.put(ch,sh.getOrDefault(ch,0)+1);
        }
        
        for(int i=0;i<s2.length();i++)
        {
            char ch = s2.charAt(i);
            sh.put(ch,sh.getOrDefault(ch,0)-1);
        }
        
        for(char x : sh.keySet())
        {
            if(sh.get(x)==-1)
            {
                return x;
            }
        }
        return '\0';
    }
}
