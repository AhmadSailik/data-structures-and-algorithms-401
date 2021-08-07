package linked.list.insertions;

import java.util.ArrayList;

public class LinkedList {
    Node head;
    Node tail;

    public void add(int value){
        Node newNode=new Node(value);
        if(head==null){
            head=newNode;
            tail=head;
        }else {
            tail.next=newNode;
            tail=tail.next;
        }
    }
    public LinkedList Append(LinkedList ll, int value){
        if (ll.head==null){
            System.out.println("your arr is empty");
        }else{
            Node current= ll.head;
            while (current.next!=null){
                current=current.next;
            }
            Node newNode=new Node(value);
            current.next=newNode;
        }

        return ll;
    }
    public LinkedList insertBefore(LinkedList ll, int value1, int value2){
        if (ll.head==null){
            System.out.println("your arr is empty");
        }else{
            if(ll.head.value==value1){
                Node newNode=new Node(value2);
                newNode.next=head;
                head=newNode;
            }else{
                Node current= ll.head;
                while (current!=null){
                    Node newNode=new Node(value2);
                    if(current.next.value==value1) {
                        newNode.next = current.next;
                        current.next = newNode;
                        break;
                    }
                    current=current.next;
                }
            }
        }
        return ll;
    }
    public LinkedList insertAfter(LinkedList ll, int value1, int value2){
        Node current= ll.head;
        while (current!=null){
            if (current.value==value1){
                Node newNode=new Node(value2);
                newNode.next=current.next;
                current.next=newNode;
            }
            current=current.next;
        }


        return ll;
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
