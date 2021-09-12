package graph;

import java.util.*;

public class Graph <k>{
    ArrayList<k>arrayListOfNode=new ArrayList<>();
    Map<k,List<Node<k>>>graphList;
    public Graph(){
        graphList=new HashMap<>();
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
    public ArrayList<k> allNode(){
        return arrayListOfNode;
    }
    public Object getNighbors(k value){
        if (graphList.containsKey(value)){
            return graphList.get(value);
        }else {
            return "is'n exisit";
        }
    }
    public int size(){
        return arrayListOfNode.size();
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
//public class Graph {
//    List<Edge>GraphList[];
//    public Graph(int n){
//    GraphList=new LinkedList[n];
//        for (int i = 0; i < GraphList.length; i++) {
//            GraphList[i]=new LinkedList<Edge>();
//        }
//    }
//    public void addEdge(int u,int v,int w){
//        GraphList[u].add(0,new Edge(v,w));
//    }
//    public boolean isConected(int u, int v){
//        for (Edge i: GraphList[u]) {
//            if (i.v==v){
//                return true;
//            }
//        }
//        return false;
//    }
//    @Override
//    public String toString(){
//        String result="";
//        for (int i = 0; i < GraphList.length; i++) {
//            result+=i+"=>"+GraphList[i]+"\n";
//        }
//        return result;
//    }
//}
