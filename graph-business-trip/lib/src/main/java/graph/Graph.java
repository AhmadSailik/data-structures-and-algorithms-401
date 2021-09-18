package graph;

import java.util.*;

public class Graph <k,w>{
    ArrayList<k>arrayListOfNode=new ArrayList<>();
    Map<k,List<Node<k,w>>>graphList;
    public Graph(){
        graphList=new HashMap<>();
    }
    public String isConnected(String[]strings){
        int weight=0;
        boolean check=false;
        for (int j= 0; j < strings.length-1; j++) {
            String checkWeight= "null";
            for (Node<k,w>i : graphList.get(strings[j])) {
                if (i.value==strings[j+1]){
                    checkWeight= i.weight.toString();
                    weight+=(int) i.weight;
                   check=true;
                }
            }
            if (checkWeight.equals("null")){
                weight=0;
                check=false;
                return check+" $"+weight;
            }

        }

        return check+" $"+weight;
    }
    public void addEdge(k key,k value,w weight){
        if(!graphList.containsKey(key)){
            graphList.put(key,new LinkedList<>());
            if (!arrayListOfNode.contains(key))
            arrayListOfNode.add(key);
        }
        if (!arrayListOfNode.contains(value))
        arrayListOfNode.add(value);
        graphList.get(key).add(new Node<>(key, value, weight));

    }
    public void undirectedEdge(k key,k value,w weight){
       addEdge(key, value, weight);
       addEdge(value, key, weight);
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

