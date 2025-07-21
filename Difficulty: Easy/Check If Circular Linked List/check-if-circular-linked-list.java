/* Structure of LinkedList
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/
class Solution {
    boolean isCircular(Node head) {
        // Your code here
        if(head==null) return true;
        Node current = head.next;
        
        while(current!=null && current!=head)
        {
            current=current.next;    
        }
        return current==head;
    }
}