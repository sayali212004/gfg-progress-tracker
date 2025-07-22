/* structure of list Node:

class Node
{
    int data;
    Node next;

    Node(int a)
        {
            data = a;
            next = null;
        }
}

*/

class Solution {
    // Function to find the intersection of two linked lists
    public Node findIntersection(Node head1, Node head2) {
        // add your code here
        HashSet <Integer> sh = new HashSet<>();
        
        Node temp2=head2;
        
        while(temp2!=null)
        {
            sh.add(temp2.data);
            temp2=temp2.next;
        }
        Node temp1=head1;
        
        Node dummy = new Node(0);
        Node tail = dummy;
        
        while(temp1!=null)
        {
            if(sh.contains(temp1.data))
            {
                tail.next= new Node(temp1.data);
                tail=tail.next;
            }
            temp1 = temp1.next;
        }
        return dummy.next;
    }
}