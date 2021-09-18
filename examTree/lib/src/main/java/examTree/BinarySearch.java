//package examTree;
//
//public class BinarySearch extends BinaryTree {
//Node root;
//    public void add(int value) {
//        Node newNode=new Node(value);
//        if(root==null){
//            root=newNode;
//        }else {
//            Node current=root;
//            Node parent;
//            while (true){
//                parent=current;
//                if(value<current.value){
//                    current=current.left;
//                    if (current==null){
//                        parent.left=newNode;
//                        return;
//                    }
//                }else {
//                    current=current.right;
//                    if (current==null){
//                        parent.right=newNode;
//                        return;
//                    }
//                }
//            }
//        }
//    }
//
//
//    public void preOrder() {
//        super.preOrder(root);
//    }
//
//
//    public void postOrder() {
//        super.postOrder(root);
//    }
//
//
//    public void inOrder() {
//        super.inOrder(root);
//    }
//}
