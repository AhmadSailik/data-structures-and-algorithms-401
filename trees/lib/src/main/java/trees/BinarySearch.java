package trees;

import java.util.ArrayList;

public class BinarySearch extends BinaryTree {
Node root;
    ArrayList<Integer>arrayList=new ArrayList<>();
    public ArrayList<Integer> add(int value){
        arrayList.add(value);
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
                        return arrayList;
                    }
                }else {
                    current=current.right;
                    if (current==null){
                        parent.right=newNode;
                        return arrayList;
                    }
                }
            }
        }
        return arrayList;
    }
    public boolean contains(int value){

        return arrayList.contains(value);
    }


    public ArrayList<Integer> preOrder() {
        ArrayList<Integer> arrayList=new ArrayList<>();
        super.preOrder(root,arrayList);
        return arrayList;
    }
    public ArrayList<Integer> inOrder() {
        ArrayList<Integer> arrayList=new ArrayList<>();
        super.inOrder(root,arrayList);
        return arrayList;
    }
    public ArrayList<Integer> postOrder() {
        ArrayList<Integer> arrayList=new ArrayList<>();
        super.postOrder(root,arrayList);
        return arrayList;
    }

}
