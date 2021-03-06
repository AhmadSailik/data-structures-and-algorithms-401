/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashmap.tree.intersection;

import java.util.ArrayList;

public class Library {
    public boolean someLibraryMethod() {

        return true;
    }
    public static ArrayList<Integer> addDuplicateValue (ArrayList arrayList1, ArrayList arrayList2){
        int value=0;
        ArrayList<Integer>arrayList=new ArrayList<>();
        HashTable hashTable=new HashTable();
        for (int i = 0; i < arrayList1.size(); i++) {
            hashTable.add((Integer) arrayList1.get(i),value);
        }
        for (int i = 0; i < arrayList2.size(); i++) {
            if(!arrayList.contains((Integer) arrayList2.get(i))){
                if(hashTable.isContain((Integer) arrayList2.get(i))){
                    arrayList.add((Integer) arrayList2.get(i));
                }
            }

        }
        return arrayList;
    }

    public static void main(String[] args) {

        BinaryTree binaryTree=new BinaryTree();
        Node root=new Node(150);
        root.left=new Node(100);
        root.right=new Node(250);
        root.left.left=new Node(75);
        root.left.right=new Node(160);
        root.left.right.right=new Node(175);
        root.left.right.left=new Node(125);
        root.right.left=new Node(200);
        root.right.right=new Node(350);
        root.right.right.left=new Node(300);
        root.right.right.right=new Node(500);
        binaryTree.preOrder(root);
//        System.out.println(binaryTree.arrayList);
        BinaryTree binaryTree1=new BinaryTree();
        Node root1=new Node(42);
        root1.left=new Node(100);
        root1.right=new Node(600);
        root1.left.left=new Node(15);
        root1.left.right=new Node(160);
        root1.left.right.right=new Node(175);
        root1.left.right.left=new Node(125);
        root1.right.left=new Node(200);
        root1.right.right=new Node(350);
        root1.right.right.left=new Node(4);
        root1.right.right.right=new Node(500);
        binaryTree1.preOrder(root1);

        System.out.println(addDuplicateValue(binaryTree.arrayList,binaryTree1.arrayList));


    }
}
