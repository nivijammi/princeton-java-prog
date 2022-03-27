package edu.princeton.week2;


import org.junit.Test;

public class convertItoBaseKTest {
    @Test
    public void converterMethod() {
        convertItoBaseK baseCase = new convertItoBaseK();
        String expected = "4b6";
        String actual = baseCase.converterMethod(1206, 16);
        System.out.println(actual);
    }


}