package com;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class J003_Calctest{




        @Test
        public void addTest()
        {
            Calc c = new Calc();
           int actualResult= c.add(10,20);
            int expectedResult= 30;
           assertEquals(expectedResult,actualResult);
        }

}