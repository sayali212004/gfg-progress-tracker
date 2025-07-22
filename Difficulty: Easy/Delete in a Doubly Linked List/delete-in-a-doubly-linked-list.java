/*

Definition for doubly Link List Node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node deleteNode(Node head, int x) {
        // code here
        if(head==null)
        {
            return null;
        }
        
        if(x==1)
        {
            head=head.next;
            if(head!=null)
            {
                head.prev=null;
            }
            return head;
        }
        
        Node current = head;
        int count=1;
        
        while(current!=null && count<x)
        {
            current=current.next;
            count++;
        }
        
        if(current==null)return head;
        
        if(current.prev!=null)
        {
            current.prev.next=current.next;
        }
        
        if(current.next!=null)
        {
            current.next.prev=current.prev;
        }
        return head;
    }
}