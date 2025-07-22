class Solution {
    int maxProduct(int[] arr) {
        // code here
        if (arr == null || arr.length == 0) return 0;
        
        int maxProduct =arr[0];
        int minProduct =arr[0];
        int maxSoFar= arr[0];
        
        for(int i=1;i<arr.length;i++)
        { 
            
            int tempmax = maxProduct;
            int tempmin = minProduct;
            maxProduct = Math.max(arr[i],Math.max(tempmax*arr[i], tempmin*arr[i]));
            minProduct = Math.min(arr[i], Math.min(tempmin*arr[i],tempmax*arr[i]));
            
            maxSoFar = Math.max(maxProduct, maxSoFar);
        }
        return maxSoFar;
    }
}