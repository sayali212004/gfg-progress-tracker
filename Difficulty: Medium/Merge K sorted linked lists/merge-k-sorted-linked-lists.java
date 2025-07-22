/*class Node
{
    int data;
    Node next;

    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

// arr is an array of Nodes of the heads of linked lists

class Solution {
    // Function to merge K sorted linked list.
    Node mergeKLists(List<Node> arr) {
        // Add your code here.
        PriorityQueue<Node>pq=new PriorityQueue<>((a,b)->a.data-b.data);
        
        for(int i=0;i<arr.size();i++)
        {
            if(arr.get(i)!=null)
            {
                pq.add(arr.get(i));
            }
        }
        
        Node dummy=new Node(0);
        Node current=dummy;
        
        while(!pq.isEmpty())
        {
            Node smallest=pq.poll();
            current.next=smallest;
            current=current.next;
            
            if(smallest.next != null)
            {
                pq.add(smallest.next);
            }
        }
        
        return dummy.next;
    }
}