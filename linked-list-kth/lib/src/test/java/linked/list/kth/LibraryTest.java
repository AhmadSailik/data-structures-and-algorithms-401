/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linked.list.kth;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
    @Test public void kthNumber(){
        LinkedList ll=new LinkedList();
        ll.add(1);
        ll.add(3);
        ll.add(8);
        ll.add(2);

        String result1="-1: it's lower than size of LinkedList,try number lower than: 4";
        String result2="9: it's bigger than size of LinkedList,try number lower than: 4";
        int result3=2;
        assertEquals("this test for k lower of size of likedList: ",result1,String.valueOf(ll.getFomEndList(-1)));
        assertEquals("this test for k bigger of size of likedList: ",result2,String.valueOf(ll.getFomEndList(9)));
        assertEquals("this test for k between zero and size of likedList: ",result3,ll.getFomEndList(0));

    }
}
