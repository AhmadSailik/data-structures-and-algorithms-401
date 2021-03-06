/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.queue.brackets;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
    @Test public void bracket(){
        assertTrue(Library.balanceBracket("()[[Extra Characters]]"));
        assertTrue(Library.balanceBracket("{}{Code}[Fellows](())"));
        assertTrue(Library.balanceBracket("(){}[[]]"));
        assertFalse(Library.balanceBracket("{(})"));
        assertFalse(Library.balanceBracket("(]("));
        assertFalse(Library.balanceBracket(")"));
        assertFalse(Library.balanceBracket("{"));
    }
}
