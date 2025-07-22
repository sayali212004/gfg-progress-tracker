// User function Template for Java

class Solution {
    static int countPairs(int arr[], int n) {
        // Your code goes here
        int val []= new int[n];
        
        for(int i=0;i<n;i++)
        {
            val[i]=arr[i]*i;
        }
        
        return mergeSortAndCount(val,0,n-1);
    }
    
    private static int mergeSortAndCount(int arr[], int left , int right)
    {
        int count=0;
        
        if(left<right)
        {
            int mid=left+(right-left)/2;
        
            count=count+mergeSortAndCount(arr,left,mid);
            count=count+mergeSortAndCount(arr,mid+1,right);
            
            count=count+merge(arr,left,mid,right);
        }
        
        return count;
    }
    
    private static int merge(int [] arr, int left,int mid, int right)
    {
        int i=left;
        int j=mid+1;
        int k=0;
        int temp []= new int [right-left+1];
        int count=0;
        
        while(i<=mid && j<=right)
        {
            if(arr[i]<=arr[j])
            {
                temp[k]=arr[i];
                k++;
                i++;
            }
            else
            {
                count = count+(mid-i+1);
                temp[k]=arr[j];
                k++;
                j++;
            }
        }
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        for (int x = 0; x < temp.length; x++) 
        {
            arr[left + x] = temp[x];
        }
        return count;
    }
}
