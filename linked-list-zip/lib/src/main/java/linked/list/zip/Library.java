/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linked.list.zip;

import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {
    public boolean someLibraryMethod() {

        return true;
    }
    public static void zipFunction(LinkedList first,LinkedList sec){
//        LinkedList ll3=new LinkedList();
//        ll3=ll3.zip(first,sec);
//        System.out.println("list 1: "+first.getValue(first));
//        System.out.println("lisr 2: "+sec.getValue(sec));
//        System.out.println(ll3.getValue(ll3));
        System.out.println(first.equals(sec));
    }

    public static void main(String[] args) {

        LinkedList ll1=new LinkedList();
//        ll1.add(1);
//        ll1.add(2);
//        ll1.add(4);
//        ll1.add(2);
//        ll1.add(1);
        LinkedList ll2=new LinkedList();
        ll2.add(1);
        ll2.add(2);
        ll2.add(4);
        ArrayList<Integer>l1=new ArrayList<Integer>();
        ArrayList<Integer>l2=new ArrayList<Integer>();
        Node current=ll1.head;
        while (current!=null){
            l1.add(current.value);
            current=current.next;
        }
        Node current1=ll2.head;
        while (current1!=null){
            l2.add(current1.value);
            current1=current1.next;
        }

//        System.out.println(ll1.tail);
        List<Integer>l3= Lists.reverse(l1);
        System.out.println(l1.equals(l3));
        System.out.println(l3);

//        zipFunction(ll1,ll2);

    }



}
