package edu.princeton.week2;

import java.util.Random;
/**
 * Random walk. A Java programmer begins walking aimlessly.
 * At each time step, she takes one step in a random direction
 * (either north, east, south, or west), each with probability 25%.
 * She stops once she is at Manhattan distance r from the starting point.
 * How many steps will the random walker take? This process is known as a two-dimensional random walk.
 * Random 2D walk
 * Write a program RandomWalker.java that takes an integer command-line argument r
 * and simulates the motion of a random walk until the random walker is at Manhattan distance r from the starting point.
 * Print the coordinates at each step of the walk (including the starting and ending points),
 * treating the starting point as (0, 0). Also, print the total number of steps taken.
 *
 * ans: loop while the Manhattan Distance from start is less than the desired Manhattan Distance.
 * take a step - calculate new coordinates
 * increase the step counter
 * print the coordinates (start - end coordinates)
 * recalculate the Manhattan Distance.
 * End of the loop
 * Print the total number of steps
 * */

public class RandomWalk {

                     // N2 (x,y+1)
    // W1 (x-1,y)        (x, y)      // E0 (x+1,y)
                    // S3  (x,y-1)



    public int randomWlk(int r) {
        int x = 0; int y = 0;
        int currentDistance = 0;
        int stepsTakenInTotal = 0;

        System.out.println("Initial Coordinates (" + x + "," + y + ")"); // prints the initial (0,0) step

        // while currentDistance < r
        while(currentDistance < r){

            // generates the random direction the walker wishes to take
            int randomNum = generateRandomNum();

            // Update the coordinates x or y values
            if(randomNum == 0){//north
                y++;
            }else if(randomNum == 1){//south
                y--;
            }else if(randomNum == 2){//east
                x++;
            }else if(randomNum == 3){//west
                x--;
            }else{
                System.err.println("In else .... x" +x + " y " +y);
            }

            // Calculate the distance
            currentDistance = calculateManhattanDistance(x, y);

            // Increment the steps
            stepsTakenInTotal += 1;

            // Print current state
            System.out.println("Updated Coordinates (" + x + "," + y + ") currentDistance " +currentDistance +" stepsTakenInTotal " +stepsTakenInTotal);
        }

        System.out.println(stepsTakenInTotal);
        return stepsTakenInTotal;
    }

    private int calculateManhattanDistance(int x, int y) {
        int distance = Math.abs(x) + Math.abs(y);
        return distance;
    }

    public int generateRandomNum(){
        Random random = new Random();
        int value = random.nextInt(4);
        System.out.println(value);
        return value;
    }



    public static void main(String[] args) {
        RandomWalk walker = new RandomWalk();
        walker.randomWlk(5);
    }


}
