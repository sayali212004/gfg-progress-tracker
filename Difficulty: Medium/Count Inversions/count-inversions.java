// User function Template for Java

class Solution {
    // Function to count inversions in the array.
    static int inversionCount(int arr[]) {
        // Your Code Here
        return mergeSortAndCount(arr,0,arr.length-1);
        
    }
    
    public static int mergeSortAndCount(int arr[], int left, int right)
    {
        
        int count=0;
        if(left<right)
        {
            int mid=left+(right-left)/2;
            count=count+mergeSortAndCount(arr,left,mid);;
            count=count+mergeSortAndCount(arr,mid+1,right);
            count=count+merge(arr,left,mid, right);
        }
        return count;
    }
    
    public static int merge(int arr[], int left,int mid, int right)
    {
        int i=left;
        int j=mid+1;
        int k=0;
        int count=0;
        int temp []=new int [right - left + 1];
        
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
        
        while(i<=mid)
        {
            temp[k]=arr[i];
            k++;
            i++;
        }
        
        while(j<=right)
        {
            temp[k]=arr[j];
            k++;
            j++;
        }
        
        for(int m=0;m<temp.length;m++)
        {
            arr[left+m]=temp[m];
        }
    
        return count;
    }
    
}