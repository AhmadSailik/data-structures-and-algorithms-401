package graph;

public class Queue <k>{
    NodeQ<k> front;
    NodeQ<k> rear;
        public void enqueue(k value){
        NodeQ<k> newNode = new NodeQ(value);
        if (front == null){
            front = newNode;
            rear = front;
        }else{
            rear.next = newNode;
            rear = newNode;
        }
    }
        public k dequeue(){
        k value=null;
        if (front!=null){
            value=front.value;
            front=front.next;
        }

        return value;
        }
    public boolean isEmpty(){
            if(front==null){
                return true;
            }
            return false;
    }
}
