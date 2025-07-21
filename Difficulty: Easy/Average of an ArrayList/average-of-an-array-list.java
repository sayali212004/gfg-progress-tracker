// User function Template for Java
class Solution {
    // function should calculate and return the
    // average of all the non negative integers
    // from the arraylist provided in the
    // parameter
    public static double posAverage(ArrayList<Integer> list) {
        double sum=0;
        int count=0;
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)>=0)
            { 
                count++;
                sum=sum+list.get(i);   
            }
        }
        
        if(count==0) return 0.0;
        
        return sum/count;
    }
}