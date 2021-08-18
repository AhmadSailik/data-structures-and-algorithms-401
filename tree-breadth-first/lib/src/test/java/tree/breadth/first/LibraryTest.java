/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package tree.breadth.first;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
    @Test public void breadth(){
        BinaryTree binaryTree=new BinaryTree();
        Node root=new Node(3);
        root.left=new Node(5);
        root.right=new Node(30);
        root.left.left=new Node(20);
        root.left.right=new Node(6);
        root.right.left=new Node(9);
        root.right.right=new Node(8);
        String result="[3, 5, 30, 20, 6, 9, 8]";
        assertEquals("this for binaryTree",result,String.valueOf(binaryTree.breadth(root)));
    }
}