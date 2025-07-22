

// User function Template for Java

// class Node
// {
//     int data;
//     Node left, right;

//     public Node(int d)
//     {
//         data = d;
//         left = right = null;
//     }
// }

class Solution {
    
    public int kthSmallest(Node root, int k) {
       
        int[] result = new int[2]; 
        result[0] = 0; 
        result[1] = -1; 
        
        inOrderTraversal(root, k, result);
        
        return result[1]; 
    }
    
    private void inOrderTraversal(Node node, int k, int[] result) {
        if (node == null) {
            return;
        }
        
        
        inOrderTraversal(node.left, k, result);
        
       
        result[0]++;
        if (result[0] == k) {
            result[1] = node.data;
            return;
        }
        
        
        inOrderTraversal(node.right, k, result);
    }
}
