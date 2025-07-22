//User function Template for Java
class Solution{
public static void utility(String s){
    // Length of string is given by s.length()
    // character at any index i is given by s.charAt(i)
    
    //Write your code here
    StringBuffer res=new StringBuffer();
    for(int i=0;i<s.length();i+=2)
    {
        System.out.print(s.charAt(i));
        
    }
    
}   
}
