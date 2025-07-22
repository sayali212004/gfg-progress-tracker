class Solution {

    void mergeSort(int arr[], int l, int r) {
        // code here
        if(l<r)
        {
            int mid=l+(r-l)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            
            merge(arr,l,mid,r);
        }
    }
    
    void merge(int arr[], int l, int mid, int r)
    {
        int i=l;
        int j=mid+1;
        int k=0;
        
        int temp []= new int [r-l+1];
        
        while(i<=mid && j<=r)
        {
            if(arr[i]<=arr[j])
            {
                temp[k]=arr[i];
                k++;
                i++;
            }
            else
            {
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
        
        while(j<=r)
        {
            temp[k]=arr[j];
            k++;
            j++;
        }
        
        for(int x=0;x<temp.length;x++)
        {
            arr[l+x]=temp[x];
        }
    }
}