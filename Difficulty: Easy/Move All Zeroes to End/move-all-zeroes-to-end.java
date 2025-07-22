

// User function Template for Java

class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int ptr=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[ptr++]=arr[i];
            }
            
        }
        
        while(ptr<arr.length)
        {
            arr[ptr++]=0;
        }
        //return arr;
    }
}