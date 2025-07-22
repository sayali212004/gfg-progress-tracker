// User function Template for Java

class Solution {
    // Function to merge the arrays.
    public void mergeArrays(int a[], int b[]) {
        // code here
        int m=a.length;
        int n=b.length;
        int gap=(int) Math.ceil((n+m)/2);
        
        while (gap>0)
        {
            int i=0;
            int j=gap;
            
            while(j<n+m)
            {
                int val1=getValue(a,b,i,m);
                int val2=getValue(a,b,j,m);
                
                if(val1>val2)
                {
                    setValue(a,b,i,m,val2);
                    setValue(a,b,j,m,val1);
                }

                i++;
                j++;

            }
            
            // if(gap==1)
            // break;
            
            // gap=gap+1/2;
            gap=(gap<=1) ? 0:(gap+1)/2; 
        }
    }
    
    private static int getValue(int a[], int b[],int index, int n)
    {
        return (index<n) ? a[index] : b[index-n];
    }
    
    private static void setValue(int a[], int b[], int index,int n,int value)
    {
        if(index<n)
        {
            a[index]=value;
        }
        else
        {
            b[index-n]=value;
        }
    }
}
