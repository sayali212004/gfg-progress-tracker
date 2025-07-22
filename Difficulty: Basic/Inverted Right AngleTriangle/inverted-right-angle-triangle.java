
//User function Template for Java
class Solution{
public static void invTriangleWall(int s){
    
    //Write your code here
    for(int i=0;i<s;i++)
    {
        for(int j=0;j<s-i;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
}   
}

