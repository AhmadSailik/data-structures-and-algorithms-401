package linked.list.kth;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {
    Node head;
    Node tail;
    public void add(int value){
        Node nodeAdd=new Node(value);
        if(head==null){
            head=nodeAdd;
            tail=head;
        }else{
            tail.next=nodeAdd;
            tail=nodeAdd;
        }
    }
    public ArrayList<Integer> getValue(){
        ArrayList<Integer>valuesOfList=new ArrayList<Integer>();
        Node current= head;
        while (current!=null){
            valuesOfList.add(current.vlaue);
            current=current.next;
        }
        return valuesOfList;
    }
    public Object getFomEndList(int k){
        List<Integer> nodesArrRev =Lists.reverse(getValue());
        if(k<nodesArrRev.size()&&k>=0){
            return nodesArrRev.get(k);
        }else if(k>=nodesArrRev.size()) {
            return k+": it's bigger than size of LinkedList,try number lower than: "+nodesArrRev.size();
        }else {
            return k+": it's lower than size of LinkedList,try number lower than: "+nodesArrRev.size();
        }

    }

}
