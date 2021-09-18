package examTree;

public class BinaryTree {
    Node root;

    public void preOrder(Node node){
        while (node!=null){
            System.out.println(node.value);
            if (node.left!=null){
                preOrder(node.left);
            }
            if (node.right!=null){
                preOrder(node.right);
            }
        return;
        }
    }
    public void postOrder(Node node){
        while (node!=null){
            if (node.left!=null){
                postOrder(node.left);
            }
            if (node.right!=null){
                postOrder(node.right);
            }
            System.out.println(node.value);
        return;
        }
    }
    public void inOrder(Node node){
        while (node!=null){

            if (node.left!=null){
                inOrder(node.left);
            }
            System.out.println(node.value);
            if (node.right!=null){
                inOrder(node.right);
            }
            return;
        }
    }
}
