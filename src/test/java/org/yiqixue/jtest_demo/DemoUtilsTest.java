package org.yiqixue.jtest_demo;

import org.junit.jupiter.api.DisplayName;
import org.yiqixue.jtest_demo.DemoUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class DemoUtilsTest {

    @Test
    void testEqualsNotEquals(){
        DemoUtils demoUtils = new DemoUtils();

        assertEquals(6, demoUtils.add(2,4), "2+4 must be 6");
        assertNotEquals(6, demoUtils.add(4,4), "4+4 must be 6");
    }

    @Test
    void testNullAndNotNull(){
        DemoUtils demoUtils = new DemoUtils();

        String str1 = null;
        String str2 = new String("hello");

        assertNull(demoUtils.checkNull(str1), "Str1 should be null;");
    }

    @Test
    @DisplayName("Same or Not the Same")
    void testSameNotSame(){
        DemoUtils demoUtils = new DemoUtils();

        String str = "yiqixue.org";

        assertSame(demoUtils.getAcademy(), demoUtils.getAcademyDuplicate(), "objects should refer to the same object");
        assertNotSame(str, demoUtils.getAcademy(), "should not refer to the same object");
    }
}
