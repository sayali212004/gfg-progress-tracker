// User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
*/
class Join {
    public static Node joinTheLists(Node head1, Node head2) {
        // your code here
        if(head1==null) return head2;
        if(head2==null) return head1;
        
        Node current=head1;
        
        while(current.next!=null)
        {
            current=current.next;
        }
        current.next=head2;
        
        return head1;
    }
}