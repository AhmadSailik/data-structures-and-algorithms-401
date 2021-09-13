package graph;

import java.util.*;

public class Graph <k>{
    ArrayList<k>arrayListOfNode=new ArrayList<>();
    Map<k,List<Node<k>>>graphList;
    ArrayList<k>nodes=new ArrayList<>();
    ArrayList<k>visited=new ArrayList<>();

    public Graph(){
        graphList=new HashMap<>();
    }
    public ArrayList<k> BreadthFirst(k key){
        if (graphList.containsKey(key)){
            Queue<k>queue=new Queue<k>();
            queue.enqueue(key);
            visited.add(key);
            for (Node<k>i : graphList.get(key)) {
                queue.enqueue(i.value);
                visited.add(i.value);
            }
            while (!queue.isEmpty()){
                k front=queue.dequeue();
                nodes.add(front);
                for (Node<k>i : graphList.get(front)) {
                    if (!visited.contains(i.value)){
                        visited.add(i.value);
                        queue.enqueue(i.value);
                    }
                }
            }
        }
        return nodes;
    }
    public String addNode(k key){
        if(!graphList.containsKey(key)){
            graphList.put(key,new LinkedList<>());
            arrayListOfNode.add(key);
            return key.toString();
        }
        return "it's already exist";
    }
    public void addEdge(k key,k value){
        if(!graphList.containsKey(key)){
            graphList.put(key,new LinkedList<>());
            if (!arrayListOfNode.contains(key))
            arrayListOfNode.add(key);
        }
        if (!arrayListOfNode.contains(value))
        arrayListOfNode.add(value);
        graphList.get(key).add(new Node<>(key, value));

    }
    public void undirectedEdge(k key,k value){
       addEdge(key, value);
       addEdge(value,key);
    }


    @Override
    public String toString(){
        String result="";
        for (k key:graphList.keySet()){
            result+=key+"==>"+graphList.get(key)+"\n";
        }
        return result;
    }
}

