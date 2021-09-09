package hashmap.tree.intersection;

import java.util.ArrayList;

public class BinaryTree {
    ArrayList<Integer> arrayList=new ArrayList<>();
    public ArrayList preOrder(Node root){

        if(root!=null){
//            System.out.println(root.value);
            arrayList.add(root.value);
            if(root.left!=null){
                preOrder(root.left);
            }if (root.right!=null){
                preOrder(root.right);
            }
        }
        return arrayList;
    }
}
