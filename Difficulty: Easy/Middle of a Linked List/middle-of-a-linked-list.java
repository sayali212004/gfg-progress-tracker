/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    int getMiddle(Node head) {
        // Your code here.
        Node current = head;
        int count=0;
        
        while(current!=null)
        {
            count++;
            current=current.next;
        }
        
        int mid = (count)/2;
        
        current = head;
        for (int i = 0; i < mid; i++) 
        {
            current = current.next;
        }
        
        return current.data;
    }
}