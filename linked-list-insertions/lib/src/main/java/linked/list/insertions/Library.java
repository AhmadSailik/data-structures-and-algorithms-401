/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linked.list.insertions;

import java.util.Arrays;

public class Library {
    public boolean someLibraryMethod() {

        return true;
    }
    public static void insertions(LinkedList ll){
//         System.out.println(ll.getValue());
         ll.Append(ll,10);
        System.out.println("Append: "+ll.getValue(ll));
        ll.insertBefore(ll,1,12);
        System.out.println("Befor: "+ll.getValue(ll));
        ll.insertAfter(ll,10,16);
        LinkedList ll3=new LinkedList();
        ll3.insertAfter(ll3,10,16);
//        ll3.insertBefore(ll3,1,12);
        ll3.Append(ll3,10);
        System.out.println("Append: "+ll3.getValue(ll3));
        System.out.println("After: "+ll.getValue(ll));

    }

    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        insertions(ll);
    }
}
