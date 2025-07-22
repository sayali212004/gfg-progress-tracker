

// User function Template for Java

class Solution{
    static double switchCase(int choice, List<Double> arr){
        // code here
        switch(choice)
        {
            case 1:
            {
                double R = arr.get(0);
                return Math.PI*R*R;
            }
                
            
            case 2:
            {
                double L = arr.get(0);
                double B = arr.get(1);
                return L*B;
            }
            
            default :
            return 0.0;
                
        }
        
    }
}