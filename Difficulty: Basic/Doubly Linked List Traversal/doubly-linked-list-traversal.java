// User function Template for Java

/*
class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public static ArrayList<Integer> displayList(Node head) {
        // your code here
        Node current = head;
         ArrayList <Integer> arr = new ArrayList<>();
         
         while(current!=null)
         {
             arr.add(current.data);
             current = current.next;
         }
         return arr;
    }
}