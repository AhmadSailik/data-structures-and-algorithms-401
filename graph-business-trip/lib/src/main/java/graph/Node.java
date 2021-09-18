package graph;

public class Node <k,w>{
    k key;
    k value;
    w weight;

    public Node(k key, k value, w weight) {
        this.key = key;
        this.value = value;
        this.weight=weight;
    }

    @Override
    public String toString() {

        return value.toString();
    }
}
