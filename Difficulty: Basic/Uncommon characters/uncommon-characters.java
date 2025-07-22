// User function Template for Java

class Solution {
    String uncommonChars(String s1, String s2) {
        
        TreeSet<Character> s = new TreeSet();
        
        for(int x=0;x<s1.length();x++){
            if(s2.indexOf(s1.charAt(x)) == -1){
                s.add(s1.charAt(x));
            }
        }
        
        for(int x=0;x<s2.length();x++){
            if(s1.indexOf(s2.charAt(x)) == -1){
                s.add(s2.charAt(x));
            }
        }
        
        StringBuilder a = new StringBuilder();
        for(Character cr: s){
            a.append(cr);
        }
        
        return a.toString();
        
    }
}
