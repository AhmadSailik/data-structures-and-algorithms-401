package linked.list.zip;

import java.util.ArrayList;

public class LinkedList {
    Node head;
    Node tail;
    ArrayList<Integer>list1=new ArrayList<Integer>();
    ArrayList<Integer>list2=new ArrayList<Integer>();
    public void add(int value){
        Node nodeAdd=new Node(value);
        if(head==null){
            head=nodeAdd;
            tail=head;
        }else {
            tail.next=nodeAdd;
            tail=tail.next;
        }
    }
    public ArrayList<Integer> getValue(LinkedList first){
        ArrayList<Integer>valuesOfList=new ArrayList<Integer>();
        Node current= first.head;
        while (current!=null){
            valuesOfList.add(current.value);
            current=current.next;
        }
        return valuesOfList;
    }
    public LinkedList zip(LinkedList first, LinkedList sec){
        Node current1=first.head;
        while (current1!=null){
            list1.add(current1.value);
            current1=current1.next;
        }
        Node current2= sec.head;
        while (current2!=null){
            list2.add(current2.value);
            current2=current2.next;
        }
        LinkedList ll3=new LinkedList();
        if(list1.size()<=list2.size()){
            for (int i = 0; i < list1.size(); i++) {
                for (int j = 0; j < list2.size(); j++) {
                    if(i<list1.size()){
                        ll3.add(list1.get(i));
                        i++;
                    }
                    ll3.add(list2.get(j));
                }
            }
        }else{
            for (int i = 0; i < list2.size(); i++) {
                for (int j = 0; j < list1.size(); j++) {
                    ll3.add(list1.get(j));
                    if(i<list2.size()){
                        ll3.add(list2.get(i));
                        i++;
                    }
                }
            }
        }

       return ll3;
    }


}
