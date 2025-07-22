/*
class Node {
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.
        Node current =head;
        int count=0;
        
        if(current.next==null || current==null)
        {
            return null;
        }
        
        while(current!=null)
        {
            count++;
            current=current.next;
        }
        
        int mid=count/2;
        current =head;
        
        for (int i = 0; i < mid - 1; i++) {
            current = current.next;
        }
        
        current.next=current.next.next;
        
        return head;
    }
}