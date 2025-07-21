/*
class DLLNode {
    int data;
    DLLNode next;
    DLLNode prev;

    DLLNode(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public DLLNode reverseDLL(DLLNode head) {
        // Your code here
        if(head==null || head.next==null) return head;
        
        DLLNode current=head;
        DLLNode temp=null;
        while(current!=null)
        {
            temp=current.prev;
            current.prev=current.next;
            current.next=temp;
            
            head=current;
            current=current.prev;
        }
        
        return head;
    }
}