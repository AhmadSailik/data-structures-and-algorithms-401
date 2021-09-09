package LinkedList.total;

public class LinkedList {
    Node head;
    Node tail;
    public void add(int value){
        Node node=new Node(value);
        if(head==null){
            head=node;
            tail=head;
        }else {
            tail.next=node;
            tail=tail.next;
        }
    }
    public boolean isContain(int value){
        if (head!=null){
            Node current=head;
            while (current!=null){
                if (current.value==value){
                    return true;
                }
                current=current.next;
            }
            return false;
        }else {
            return false;
        }
    }
    public void insert(int value){
        Node node=new Node(value);
        if (head==null){
            head=node;
            tail=head;
        }else {
            node.next=head;
            head=node;
        }
    }
    public void insertBefor(int value1,int value2){
        Node node=new Node(value2);
        if(head==null){
            head=node;
            tail=head;
        }else if (head.value==value1){
            node.next=head;
            head=node;
        }else{
            Node current=head;
            while (current!=null){
                if (current.next.value==value1){
                    node.next=current.next;
                    current.next=node;
                    break;
                }
                current=current.next;
            }
        }
    }
    public void insertAfter(int value1,int value2){
        Node node=new Node(value2);
        if (head==null){
            head=node;
            tail=head;
        }else {
            Node current=head;
            while (current!=null){
                if (current.value==value1){
                   node.next=current.next;
                   current.next=node;
                }
                current=current.next;
            }
        }
    }
    public String toString(){
        String list="";
        Node current=head;
        while (current!=null){
            list=list+"{"+current.value+"} -> ";
            current=current.next;
        }
        if (current==null){
            list=list+"null";
        }
        return list;
    }
}
