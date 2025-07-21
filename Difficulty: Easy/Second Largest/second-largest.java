

// User function Template for Java

class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        if(arr.length<2)
        return -1;
        
        
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length ;i++)
        {
            if(arr[i]>max)
            {
                second_max=max;
                max=arr[i]; 
            }
            else if(arr[i]>second_max && arr[i]!=max)
            {
                second_max=arr[i];
            }
            
            
        }
        return (second_max==Integer.MIN_VALUE)? -1 : second_max;
    }
    
}