package stack.queue.pseudo;

public class Queue<T> {
    Node<T> front;
    Node<T> rear;


    public void enqueue(T value){
        Node<T> newNode = new Node(value);
        if (front == null){
            front = newNode;
            rear = front;
        }else{
            rear.next = newNode;
            rear = newNode;
        }
    }
    public void pseudoEnqueue(T value){
        Node<T> newNode = new Node(value);
        if (front == null){
            front = newNode;
            rear = front;
        }else{
            newNode.next = front;
            front= newNode;
        }
    }
    public T dequeue(){
        T value=null;
        if (front!=null){
            value=front.value;
            front=front.next;
        }

        return value;
    }
    public T pesudoDequeue(){
        T value=null;
        if (front!=null){
            Node<T>current=front;
            value=rear.value;
            while (current.next!=null){
                rear=current;
                current=current.next;
            }
            rear.next=null;


        }

        return value;
    }
    public String getValue(){
        StringBuilder string=new StringBuilder();
        Node<T> current = front;
        while (current !=null){
            string.append(current.value);
            string.append("-> ");
            current=current.next;
        }
        string.append("null");
        return string.toString();
    }
}
