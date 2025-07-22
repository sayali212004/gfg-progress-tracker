class Solution {
    public Node insertInMiddle(Node head, int x) {
        Node newNode = new Node(x);

        
        if (head == null) return newNode;

        Node slow = head;
        Node fast = head;


        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        
        newNode.next = slow.next;
        slow.next = newNode;

        return head;
    }
}
