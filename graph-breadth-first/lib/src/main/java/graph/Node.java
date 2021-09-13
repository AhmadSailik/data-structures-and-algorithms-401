package graph;

public class Node <k>{
    k key;
    k value;

    public Node(k key, k value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
