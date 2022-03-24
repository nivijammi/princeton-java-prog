package edu.princeton.week1;

import org.junit.Test;

import static org.junit.Assert.*;

public class ThreeSortTest {

    @Test
    public void shouldReturnTheSmallestOfThreeNumbers(){
        ThreeSort sort = new ThreeSort();

        int expected = 10;
        int actual = sort.getSmallestValue(10,15, 20);
        System.out.println("Actual " + actual);

        assertEquals(expected, actual);
    }
    @Test
    public void shouldReturnTheBiggestOfThreeNumber(){
        ThreeSort sort = new ThreeSort();

        int expected = 20;
        System.out.println("Expected " + expected);
        int actual = sort.getBiggestValue(10,15,20);
        System.out.println("Actual " + actual);

        assertEquals(expected, actual);

    }
    @Test
    public void shouldReturnTheMiddleOfThreeNumber(){
        ThreeSort sort = new ThreeSort();

        int expected = 15;
        System.out.println("Expected " + expected);
        int actual = sort.getMiddleValue(10,15,20, sort.getBiggestValue(10,15,20), sort.getSmallestValue(10,15,20));
        System.out.println("Actual " + actual);

        assertEquals(expected, actual);

    }

    @Test
    public void shouldPrintNumbersInAscendingOrder() {
        ThreeSort sort = new ThreeSort();
        sort.printAscendingOrder(10,15,20);
    }
}