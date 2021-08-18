package tree.fizz.buzz;

public class Node <T>{
    T value;
    Node<T> left;
    Node<T> mid;
    Node<T> right;
    Node<T> next;
    public Node(T value){
        this.value=value;
    }
}
