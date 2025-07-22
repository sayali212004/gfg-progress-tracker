
// User function Template for Java

class Solution {
    // Function to sort the array using bubble sort algorithm.
    public static void bubbleSort(int arr[]) {
        
        // code here
        boolean swapped;
        
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {   
            swapped=false;
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                swapped=true;
                }
                
                
            }
            if(!swapped) break;
        }
        
    }
}

