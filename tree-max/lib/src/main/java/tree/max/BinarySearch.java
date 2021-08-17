package tree.max;

import java.util.ArrayList;

public class BinarySearch {
    Node root;
    public int max;
    ArrayList<Integer> arrayList=new ArrayList<>();
    public void add(int value){
        Node newNode=new Node(value);
        if(root==null){
            root=newNode;
        }else {
            Node current=root;
            Node parent;
            while (true){
                parent=current;
                if(value<current.value){
                    current=current.left;
                    if (current==null){
                        parent.left=newNode;
                        return;
                    }
                }else {
                    current=current.right;
                    if (current==null){
                        parent.right=newNode;
                       return;
                    }
                }
            }
        }

    }
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
    public String maximam(){
//        max = null;
        nodeContain(root);
        return "maximum value is: "+max;
    }
}
