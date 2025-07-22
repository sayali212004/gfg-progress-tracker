class Solution {
    // Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high) {
        // code here
        if(low<high)
        {
            int pivotIndex = partition(arr,low,high);
            quickSort(arr,low,pivotIndex-1);
            quickSort(arr,pivotIndex+1,high);
        }
    }

    static int partition(int arr[], int low, int high) {
        
        // your code here
        int pivot=arr[high];
        int index=low-1;
        
        for(int i=low;i<high;i++)
        {
            if(arr[i]<pivot)
            {
                index++;
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
            }
        }
        
        index++;
        int temp=arr[high];
        arr[high]=arr[index];
        arr[index]=temp;
        
        return index;
    }
}