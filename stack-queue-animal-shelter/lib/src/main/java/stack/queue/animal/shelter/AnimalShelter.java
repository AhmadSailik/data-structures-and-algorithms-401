package stack.queue.animal.shelter;

import java.util.ArrayList;

public class AnimalShelter<T> {
    Node<T> front;
    Node<T> rear;
    Node<T> frontd;
    Node<T> reard;



    public void enqueue(Animal value){

            if (value.type=="cat"){
                Node<T> newNode = new Node(value);
                if (front == null){
                    front = newNode;
                    rear = front;
                }else{
                    rear.next = newNode;
                    rear = newNode;
                }
            }else if (value.type=="dog"){
                Node<T> newNode = new Node(value);
                if (frontd == null){
                    frontd = newNode;
                    reard = frontd;
                }else{
                    reard.next = newNode;
                    reard = newNode;
                }
            }



    }
    public T dequeue(String pref){
        if(pref.toLowerCase()=="cat"||pref.toLowerCase()=="dog"){
            if (pref.toLowerCase()=="cat"){
                T value=null;
                if (front!=null){
                    value=front.value;
                    front=front.next;
                }
                return value;
            }else if(pref.toLowerCase()=="dog"){
                T value=null;
                if (frontd!=null){
                    value=frontd.value;
                    frontd=frontd.next;
                }
                return value;
            }
        }else {
            return null;
        }
        return null;
    }
    public String getValueCat(){
        StringBuilder string=new StringBuilder();
        Node<T> current = front;
        while (current !=null){
            string.append(current.value);
            string.append("-> ");
            current=current.next;
        }
        string.append("null");
        return string.toString();
    }
    public String getValueDog(){
        StringBuilder string=new StringBuilder();
        Node<T> current = frontd;
        while (current !=null){
            string.append(current.value);
            string.append("-> ");
            current=current.next;
        }
        string.append("null");
        return string.toString();
    }
}
