package stack.queue.brackets;

public class Stack<T> {
    Node<T> top;

    public void push(T value) {
        Node newNode = new Node(value);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public T pop() {
        T value = null;
        if (top == null) {
            System.out.println("ERROR pop: stack is empty");
        } else {
            value = top.value;
            top = top.next;
        }
        return value;

    }

    public T peek() {
        T value = null;
        if (top == null) {
            System.out.println("ERROR peek: stack is empty");
        } else {
            value = top.value;
        }
        return value;
    }

    public boolean isEmpty() {
        boolean state = false;
        if (top == null) {
            state = true;
        } else {
            state = false;
        }
        return state;
    }
}
