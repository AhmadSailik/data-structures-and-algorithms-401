package tree.max;

public class BinaryTree {
    public int max;
    public void nodeContain(Node root){
        if(root!=null){
            if( root.value>=max){
                max=root.value;
            }
            if(root.left!=null){
                nodeContain(root.left);
            }if (root.right!=null){
                nodeContain(root.right);
            }
        }
    }
    public String maximam(Node root){
        nodeContain(root);
        return "maximum value is: "+max;
    }
}
