package hashmap.left.join;

import java.util.ArrayList;

public class LinkedList {
    Node head;
    Node tail;

    public void insert(String key, String value){
        boolean keyIsExisit=true;
        Node node=new Node (key,value);
        if(head==null){
            head=node;
            tail=head;
        }else {
            Node current=head;
            while (current!=null){
                if (current.key==key){
                    current.value=value;
                    keyIsExisit=false;
                }
                current=current.Next;
            }
            if (keyIsExisit==true){
                tail.Next=node;
                tail=tail.Next;
            }
        }
    }
    public String get(String key){
        if (head!=null) {
            Node current = head;
            while (current != null) {
                if (current.key == key) {
                    return current.value;
                }
                current = current.Next;
            }
        }
        return "NULL";
    }
    public void getKeys(ArrayList arrayList){
//    public void getKeys(){

        if (head!=null) {
            Node current = head;
            while (current != null) {
                arrayList.add(current.key);
//                System.out.println(current.key);
                current = current.Next;
            }
        }
    }
    public boolean isContains(String key){
        if (head!=null){
            Node current=head;
            while (current!=null){
                if (current.key==key){
                    return true;
                }
                current=current.Next;
            }
        }
        return false;
    }
    public String toString(){
        String list="";
        Node current=head;
        while (current!=null){
            list=list+"{"+current.key+": "+current.value+"} -> ";
            current=current.Next;
        }
        if (current==null){
            list=list+"null";
        }
        return list;
    }
}
