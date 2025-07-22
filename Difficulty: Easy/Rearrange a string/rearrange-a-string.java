// User function Template for Java

class Solution {
    public String arrangeString(String s) {
        // code here.
        StringBuilder sb = new StringBuilder ();
        int num=0;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            
            if(ch>='A' && ch<='Z')
            {
                sb.append(ch);
            }
            if(Character.isDigit(ch))
            {
                
                num = num +(ch-'0');
            }
        }
        
        char [] arr = sb.toString().toCharArray();
        Arrays.sort(arr);
        
        return new String(arr)+((num>0)?num:"");
    }
}
