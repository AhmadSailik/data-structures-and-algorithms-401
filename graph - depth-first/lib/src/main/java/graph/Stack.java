package graph;

public class Stack<k> {
    NodeN<k>top;

    public void push(k value){
        NodeN newNode=new NodeN(value);
        if (top==null){
            top=newNode;
        }else {
            newNode.next=top;
            top=newNode;
        }
    }
    public k pop(){
        k value=null;
        if(top==null){
            System.out.println("ERROR pop: stack is empty");
        }else{
            value=top.value;
            top=top.next;
        }
        return value;

    }
    public k peek(){
        k value=null;
        if(top==null){
            System.out.println("ERROR peek: stack is empty");
        }else {
            value=top.value;
        }
        return value;
    }
    public boolean isEmpty(){
        boolean state=false;
        if (top==null){
            state=true;
        }else {
            state=false;
        }
        return state;
    }
    public String getValue(){
        StringBuilder string=new StringBuilder();
        NodeN<k> current = top;
        while (current !=null){
            string.append(current.value);
            string.append("-> ");
            current=current.next;
        }
        string.append("null");
        return string.toString();
    }
}
