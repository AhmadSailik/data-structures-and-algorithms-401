package stack.queue.pseudo;

public class Queue<T> {
    Node<T> front;
    Node<T> rear;
    Stack<T> one = new Stack<T>();
    Stack<T> two = new Stack<T>();
//    public void enqueue(T value){
//        Node<T> newNode = new Node(value);
//        if (front == null){
//            front = newNode;
//            rear = front;
//        }else{
//            rear.next = newNode;
//            rear = newNode;
//        }
//    }
    public void pseudoEnqueue(T value){

        one.push(value);

    }
//    public T dequeue(){
//        T value=null;
//        if (front!=null){
//            value=front.value;
//            front=front.next;
//        }
//
//        return value;
//    }
    public T pesudoDequeue(){
        T value =null;
        if (!one.isEmpty()){
            while (!one.isEmpty()) {
                two.push(one.pop());
            }
            value=two.pop();
            while (!two.isEmpty()) {
                one.push(two.pop());
            }

        }else{
            return value;
        }


            return value;
    }
    public String getValue(){

        return one.getValue();
    }
}
