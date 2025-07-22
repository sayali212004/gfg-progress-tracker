// User function Template for Java
class Solution {
    public static void square(int s) {
        // Complete the code given below
        for(int i=0;i<s;i++)
    {
        for(int j=0;j<s;j++)
        {
            if(j==0||j==s-1||i==0||i==s-1)
            {
                System.out.print("* ");
            }
            else
            {
                 System.out.print("  ");
            }
        }
        System.out.println();
    }
}
}
