package hashmap.tree.intersection;

import java.util.ArrayList;

public class LinkedList {
    Nodes head;
    Nodes tail;

    public void insert(Integer key, int value){
        boolean keyIsExisit=true;
        Nodes nodes=new Nodes (key,value);
        if(head==null){
            head=nodes;
            tail=head;
        }else {
            Nodes current=head;

            while (current!=null){
//                System.out.println(current.key+"=="+key);
                if (current.key==key){
//                    if (!arrayList.contains(key)){
//                        arrayList.add(key);
//                        System.out.println(arrayList);
//                    }
                    current.value=value;
                    keyIsExisit=false;
                }
                current=current.Next;
            }
            if (keyIsExisit==true){
                tail.Next=nodes;
                tail=tail.Next;
            }
        }
    }
    public boolean isContains(Integer key){
        if (head!=null){
            Nodes current=head;
            while (current!=null){
                if (current.key.equals(key)){
                    return true;
                }
                current=current.Next;
            }
        }
        return false;
    }
    public String toString(){
        String list="";
        Nodes current=head;
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
