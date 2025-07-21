/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    public static Node findIntersection(Node head1, Node head2) {
        // code here.
        Node current1=head1;
        Node current2=head2;
        
        Node dummy = new Node(0);
        Node tail=dummy;
        
        while(current1!=null && current2!=null)
        {
            if(current1.data==current2.data)
            {
                tail.next=new Node(current1.data);    
                tail=tail.next;
                current1=current1.next;
                current2=current2.next;
            }
            
            
            else if(current1.data<current2.data)
            {
                current1=current1.next;
            }
            else
            {
                current2=current2.next;
            }
        }
        return dummy.next;
    }
}