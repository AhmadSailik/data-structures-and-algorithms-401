/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package graph;

import java.util.*;


public class Library {
    public boolean someLibraryMethod() {

        return true;
    }

    public static void main(String[] args) {
//        List<Integer> list[]=new LinkedList[10];
//        for (int i = 0; i < list.length; i++) {
//            list[i]=new LinkedList<>();
//        }
//        list[0].add(80);
//        list[1].add(90);
//        list[0].add(0,100);
//        System.out.println(Arrays.toString(list));
//        Graph graph=new Graph(10);
//        graph.addEdge(0,10,4);
//        graph.addEdge(1,15,3);
//        graph.addEdge(0,9,1);
//
//        System.out.println(graph);
        Graph<String>graph=new Graph<>();
//        graph.addEdge("A","Ahmad");
//        graph.addEdge("A","Ahmas");
//        graph.addEdge("A","Ahmaf");
//        graph.addEdge("B","Ahmaf");

        graph.undirectedEdge("a","b");
        graph.undirectedEdge("a","d");
        graph.undirectedEdge("b","c");
        graph.undirectedEdge("c","g");
        graph.undirectedEdge("b","d");
        graph.undirectedEdge("d","e");
        graph.undirectedEdge("d","h");
        graph.undirectedEdge("d","f");
        graph.undirectedEdge("h","f");

//        System.out.println(graph.addNode("m"));
//        System.out.println(graph.addNode("a"));
        System.out.println(graph);
        System.out.println(graph.depthFirst("a"));
//        System.out.println(graph.getNighbors("a"));

//        System.out.println(graph.getNighbors("e"));
//        System.out.println(graph.allNode());
//        System.out.println(graph.size());
    }


}
