package com;

import org.junit.*;

public class J001_NewTest {
   @Test
    public void test1()
        {
        System.out.println("Test 1 running in junit...");
    }

    @Ignore
    @Test
    public void test2()
    {
        System.out.println("Test 2 running in junit...");
    }

    @Test
    public void test3()
    {
        System.out.println("Test 3 running in junit...");
    }
    @Test
    public void test4()
    {
        System.out.println("Test 4 running in junit...");
    }
    @Before
    public void beforeTest()
    {
        System.out.println("This method will run before every test ");
    }

    @After
    public void afterTest()
    {
        System.out.println("This method will run after every test ");
    }

    @BeforeClass
    public static void beforeClass()
    {
        System.out.println("Setup");
    }

    @AfterClass
    public static void afterClass()
    {
        System.out.println("Finish");
    }


}
