package graph;

public class NodeQ<k> {
    public k value;
    NodeQ<k>next;

    public NodeQ(k value) {
        this.value = value;
    }
}
