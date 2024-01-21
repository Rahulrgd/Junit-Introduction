package com.in28minute;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyBeforeAfterTest {

    @BeforeClass
    public static void beforeAll(){
        System.out.println("Before All");
    }

    @Before
    public void beforeEach(){
        System.out.println("BeforeEach");
    }


    @Test
    public void test1(){
        System.out.println("test1");
    }
    @Test
    public void test2(){
        System.out.println("test2");
    }
    @Test
    public void test3(){
        System.out.println("test3");
    }

    @After
    public void afterEach(){
        System.out.println("AfterEach");
    }

    @AfterClass
    public static void afterAll(){
        System.out.println("AfterAll");
    }
}
