package trees;

import java.util.ArrayList;

public class BinaryTree {
//    Node root;


    public ArrayList preOrder(Node root, ArrayList arrayList){

        if(root!=null){
//            System.out.println(root.value);
            arrayList.add(root.value);
            if(root.left!=null){
                preOrder(root.left,arrayList);
            }if (root.right!=null){
                preOrder(root.right,arrayList);
            }
        }
        return arrayList;
    }




    public ArrayList inOrder(Node root,ArrayList arrayList){
        if(root!=null){
            if(root.left!=null){
                preOrder(root.left,arrayList);
            }
//            System.out.println(root);
            arrayList.add(root.value);
            if (root.right!=null){
                preOrder(root.right,arrayList);
            }
        }
        return arrayList;
    }
    public ArrayList postOrder(Node root,ArrayList arrayList){
        if(root.left!=null){
            preOrder(root.left,arrayList);
        }if (root.right!=null){
            preOrder(root.right,arrayList);
        }
//        System.out.println(root);
        arrayList.add(root.value);
        return arrayList;
    }
}
