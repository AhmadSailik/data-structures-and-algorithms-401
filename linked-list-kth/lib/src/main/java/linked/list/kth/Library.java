/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linked.list.kth;

public class Library {
    public boolean someLibraryMethod() {

        return true;
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.add(1);
        ll.add(3);
        ll.add(8);
        ll.add(2);
        ll.getValue();
        ll.getFomEndList(2);
        System.out.println(ll.getFomEndList(-1));

    }
}

