class Queues {
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();

    void push(int a) {
        q1.add(a); 
    }

    int pop() {
        if (q1.isEmpty()) return -1; 

        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        int top = q1.remove();

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return top;
    }
}
