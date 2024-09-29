package com;

import org.junit.Test;

import static org.junit.Assert.*;

public class J002_AssertionDemo {
    @Test
    public void test()
    {
        int a=70;
        int b=30;

        assertEquals(a,b);
    //    assertNotEquals(a,b);
//        assertTrue(a>b);
//        assertFalse(a>b);
//        assertNull(a);
//        assertNotNull(b);


       /* int i[] ={10,20,30,40,50,60,71};
        int j[] ={10,20,30,40,50,60,70};

            assertArrayEquals(i,j);*/
    }
}
