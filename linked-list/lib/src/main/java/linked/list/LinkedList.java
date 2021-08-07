package linked.list;

import java.util.ArrayList;

public class LinkedList {
    Node head;
    Node tail;

    public void insert(int value){
        Node newNode=new Node(value);
        if(head==null){
            head=newNode;
            tail=head;
        }else {
            tail.next=newNode;
            tail=tail.next;
        }
    }

    public boolean include(LinkedList ll, int value){
        boolean isInclude=false;
        Node current=ll.head;
        while (current!=null){
            if(current.value==value){
                isInclude=true;
            }
            current=current.next;
        }
        return isInclude;
    }
    public String toString(LinkedList ll){
        String list="" ;
        Node current=ll.head;
        while (current!=null){
            list=list+"{"+current.value+"} -> ";
            current=current.next;
        }
        if(current==null){
            list=list+" NULL";
        }
        return list;
    }
    public ArrayList<Integer> getValue(LinkedList ll){
        ArrayList<Integer>valuesOfList=new ArrayList<Integer>();
        Node current= ll.head;
        while (current!=null){
            valuesOfList.add(current.value);
            current=current.next;
        }
        return valuesOfList;
    }
}
