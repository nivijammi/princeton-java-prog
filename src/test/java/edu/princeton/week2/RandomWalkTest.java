package edu.princeton.week2;

import org.junit.Test;

public class RandomWalkTest {

    @Test
    public void shouldGenerateNewCoordinates() {
        RandomWalk walker = new RandomWalk();
        System.out.println(walker.generateRandomNum());
    }

    @Test
    public void shouldReturnTheTotalRandomstepsTaken(){
        RandomWalk walker = new RandomWalk();
        int result = walker.randomWlk(5);
        System.out.println("Result: " +result);
    }
}