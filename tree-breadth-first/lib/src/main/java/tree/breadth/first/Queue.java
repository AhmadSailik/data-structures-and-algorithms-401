package tree.breadth.first;

public class Queue {
    Node front;
    Node rear;
    public void enqueue(Node newNode){

        if (front == null){
            front = newNode;
            rear = front;
        }else{
            rear.next = newNode;
            rear = newNode;
        }
    }
    public Node dequeue(){
        Node value=null;
        if (front!=null){
            value=front;
            front=front.next;
        }

        return value;
    }
    public boolean isEmpty(){
        if(front==null){
            return true;
        }else {
            return false;
        }
    }

}
