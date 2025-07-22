
class Solution {
    public ArrayList<Integer> maxOfMins(int[] arr) {
        // Your code here
        int n = arr.length;
        int[] left = new int[n];  
        int[] right = new int[n]; 
        int[] result = new int[n]; 

        
        Arrays.fill(left, -1);
        Arrays.fill(right, n);

        
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                left[i] = stack.peek();
            }
            stack.push(i);
        }

        stack.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                right[i] = stack.peek();
            }
            stack.push(i);
        }

        
        int[] temp = new int[n + 1]; 
        Arrays.fill(temp, Integer.MIN_VALUE);

        for (int i = 0; i < n; i++) {
            int windowSize = right[i] - left[i] - 1;
            temp[windowSize] = Math.max(temp[windowSize], arr[i]);
        }

        
        for (int i = n - 1; i >= 1; i--) {
            temp[i] = Math.max(temp[i], temp[i + 1]);
        }

        
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            res.add(temp[i]);
        }

        return res;
    }
}