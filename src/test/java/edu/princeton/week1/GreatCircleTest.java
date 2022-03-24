package edu.princeton.week1;

import org.junit.Test;

import static org.junit.Assert.*;

public class GreatCircleTest {
    @Test
    public void shouldCalculateDistanceBetweenTwoPoints1() {
        GreatCircle gc = new GreatCircle();

        double expected = 5902.936364565578;
        double actual = gc.DistanceBetweenLatAndLong(40.35, 74.65, 48.87, -2.33);
        assertEquals("This is the distance between two points in kms", expected,actual, Math.abs(expected-actual));
    }

    @Test
    public void shouldCalculateDistanceBetweenTwoPoints2() {
        GreatCircle gc = new GreatCircle();

        double expected = 5902.936364565578;
        double actual = gc.DistanceBetweenLatAndLong(60.0,15.0,120.0,105.0);
        assertEquals("This is the distance between two points in kms", expected,actual, Math.abs(expected-actual));
    }
}