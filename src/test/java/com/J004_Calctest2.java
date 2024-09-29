package com;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class J004_Calctest2 {

int a;
int b;
int result;

    public J004_Calctest2(int a, int b, int result) {

        this.a = a;
        this.b = b;
        this.result = result;
    }
@Test
    public void addTest()
    {
        Calc c = new Calc();
        int actualResult= c.add(a,b);
        int expectedResult= result;
        assertEquals(expectedResult,actualResult);
    }
@Parameterized.Parameters
    public static List<Object> setData()
    {
        Object obj[][] = new Object[4][3];

        obj[0][0]=10;
        obj[0][1]=20;
        obj[0][2]=30;

        obj[1][0]=10;
        obj[1][1]=20;
        obj[1][2]=30;

        obj[2][0]=10;
        obj[2][1]=20;
        obj[2][2]=30;

        obj[3][0]=10;
        obj[3][1]=20;
        obj[3][2]=30;

        return Arrays.asList(obj);
    }

}
