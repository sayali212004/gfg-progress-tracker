//Back-end complete function Template for Java
import java.util.*;

public class Solution {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        
        // if(n==0)return 1;
        
        int count=0;
        n=Math.abs(n);
        
        while(n>0)
        {
            n=n/10;
            count++;
        }
        // return count;
    }
}