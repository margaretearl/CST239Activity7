package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertionTests {

    @Test
    public void testAssertions() {
        // assertEquals
        assertEquals("Strings should be equal", "expected", "expected");

        // assertTrue
        assertTrue("Condition should be true", 5 > 3);

        // assertFalse
        assertFalse("Condition should be false", 2 + 2 == 5);

        // assertNotNull
        assertNotNull("Object should not be null", new Object());

        // assertNull
        assertNull("Object should be null", null);

        // assertSame
        Object obj1 = new Object();
        Object obj2 = obj1;
        assertSame("References should point to the same object", obj1, obj2);

        // assertNotSame
        Object obj3 = new Object();
        assertNotSame("References should not point to the same object", obj1, obj3);

        // assertArrayEquals
        int[] expectedArray = { 1, 2, 3 };
        int[] resultArray = { 1, 2, 3 };
        assertArrayEquals("Arrays should be equal", expectedArray, resultArray);
    }
}