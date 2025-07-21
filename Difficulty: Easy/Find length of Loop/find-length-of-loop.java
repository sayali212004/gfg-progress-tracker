/*
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution 
{
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) 
    {
        // code here.
        Node slow=head;
        Node fast=head;
        
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            
            if(slow==fast)
            return findLength(slow,fast);
        }
        return 0;
    }
    
    public static int findLength(Node slow,Node fast)
    {
        int count=1;
        fast=fast.next;
        while(slow!=fast)
        {
            count++;
            fast=fast.next;
        }
        return count;
    }
}