// User function Template for Java
class Solution {
    public static void difference(int n1, int n2) {

        // Write your code here
        StringBuilder result=new StringBuilder();
    for(int i=1;i<=10;i++)
    {
        int diff=(n1*i)-(n2*i);
        result.append(diff);
        if(i<10)
        {
            result.append(" ");
        }
        
    }
    System.out.print(result);
        
    }
}