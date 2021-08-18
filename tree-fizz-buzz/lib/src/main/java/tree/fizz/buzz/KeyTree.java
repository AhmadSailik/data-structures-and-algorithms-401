package tree.fizz.buzz;

import java.util.ArrayList;

public class KeyTree <T> {
    public ArrayList breadth(Node root){
        ArrayList<Object> arrayList=new ArrayList<Object>();
        Integer divVal= (Integer) root.value;
        if (divVal%3==0&&divVal%5==0){
            root.value="FizzBuzz";
        }else if (divVal%3==0){
            root.value="Fizz";
        }else if (divVal%5==0){
            root.value="Buzz";
        }else {
            root.value=divVal.toString();
        }
        Queue queue=new Queue();
        queue.enqueue(root);
        while (!queue.isEmpty()){
            Node front= queue.dequeue();
            if (front.left!=null){
                 divVal= (Integer) front.left.value;
                if (divVal%3==0&&divVal%5==0){
                    front.left.value="FizzBuzz";
                }else if (divVal%3==0){
                    front.left.value="Fizz";
                }else if (divVal%5==0){
                    front.left.value="Buzz";
                }else {
                    front.left.value=divVal.toString();
                }
                queue.enqueue(front.left);
            }
            if (front.mid!=null){
                 divVal= (Integer) front.mid.value;
                if (divVal%3==0&&divVal%5==0){
                    front.mid.value="FizzBuzz";
                }else if (divVal%3==0){
                    front.mid.value="Fizz";
                }else if (divVal%5==0){
                    front.mid.value="Buzz";
                }else {
                    front.mid.value=divVal.toString();
                }
                queue.enqueue(front.mid);
            }
            if (front.right!=null){
                 divVal= (Integer) front.right.value;
                if (divVal%3==0&&divVal%5==0){
                    front.right.value="FizzBuzz";
                }else if (divVal%3==0){
                    front.right.value="Fizz";
                }else if (divVal%5==0){
                    front.right.value="Buzz";
                }else {
                    front.right.value=divVal.toString();
                }
                queue.enqueue(front.right);
            }
            arrayList.add( front.value);
        }
        return arrayList;
    }
}
