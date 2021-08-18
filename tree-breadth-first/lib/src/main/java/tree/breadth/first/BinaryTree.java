package tree.breadth.first;

import java.util.ArrayList;

public class BinaryTree {

    public ArrayList<Integer> breadth(Node root){
        ArrayList<Integer> arrayList=new ArrayList<>();
        Queue queue=new Queue();
        queue.enqueue(root);
        while (!queue.isEmpty()){
            Node front= queue.dequeue();
            if (front.left!=null){
                queue.enqueue(front.left);
            }

            if (front.right!=null){
                queue.enqueue(front.right);
            }
            arrayList.add(front.value);
        }
        return arrayList;
    }

}
