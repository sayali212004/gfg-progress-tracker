/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    public Pair<Node, Node> splitList(Node head) {
        // Code here
        if(head==null || head.next==null)
        {
            return new Pair<>(head,null);
        }
        
         if (head.next.next == head) {
            Node head1 = head;
            Node head2 = head.next;

            head1.next = head1; // make it circular
            head2.next = head2; // make it circular

            return new Pair<>(head1, head2);
        }
        
        Node slow=head;
        Node fast=head;
        
        while(fast.next!=head && fast.next.next!=head)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        
        Node head1=head;
        Node head2=slow.next;
         
        slow.next=head1;
        
        if(fast.next==head)
        {
            fast.next=head2;
        }
        else
        {
            fast.next.next=head2;
        }
        return new Pair<>(head1,head2);
    }
}