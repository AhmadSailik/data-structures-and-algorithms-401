package tree.fizz.buzz;

public class Queue<T> {
    Node<T> front;
    Node<T> rear;
    public void enqueue(Node<T> newNode){

        if (front == null){
            front = newNode;
            rear = front;
        }else{
            rear.next = newNode;
            rear = newNode;
        }
    }
    public Node dequeue(){
        Node<T> value=null;
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
