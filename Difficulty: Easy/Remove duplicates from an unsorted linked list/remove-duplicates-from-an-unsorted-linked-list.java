/* The structure of linked list is the following
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    // Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) {
        // Your code here
        HashSet <Integer> set = new HashSet<>();
        Node current=head;
        Node prev=null;
        
        while(current!=null)
        {
            if(!set.contains(current.data))
            {
                set.add(current.data);
                prev=current;
            }
            else
            {
                prev.next=current.next;
            }
            current=current.next;
        }
        return head;
    }
}