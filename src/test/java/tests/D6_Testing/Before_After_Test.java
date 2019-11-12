package tests.D6_Testing;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Before_After_Test {


    @Test

    public void test1(){
        System.out.println("First test");

    }
    @Test
    public void test2(){
        System.out.println("Second test");

    }

    @BeforeMethod

    public void setupMethod(){


        System.out.println("BEFORE METHOD");
    }
    @AfterMethod
    public void tearDown(){

        System.out.println("");
    }




}
