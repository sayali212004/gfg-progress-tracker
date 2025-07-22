

// User function Template for Java

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        int n=arr.length;
        d=d%n; //if d>n 
        
        reversearr(arr,0,d-1);
        
        reversearr(arr,d,n-1);
        
        reversearr(arr,0,n-1);
        
    }
        static void reversearr(int arr[], int start, int end)
        {
            while(start<end)
            {
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
        
    
}