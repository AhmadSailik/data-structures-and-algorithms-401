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



        Graph<String>graph1=new Graph<>();
        graph1.undirectedEdge("pan","are");
        graph1.undirectedEdge("are","met");
        graph1.undirectedEdge("are","mons");
        graph1.undirectedEdge("met","narn");
        graph1.undirectedEdge("met","nabo");
        graph1.undirectedEdge("met","mons");
        System.out.println(graph1);
        System.out.println(graph1.BreadthFirst("pan"));

    }


}
