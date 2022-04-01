package edu.princeton.week2;

import java.util.Random;

/**
 * Random walkers. Write a program RandomWalkers.
 * java that takes two integer command-line arguments r and trials.
 * In each of trials independent experiments, simulate a random walk
 * until the random walker is at Manhattan distance r from the starting point.
 * Print the average number of steps.
 *
 * As r increases, we expect the random walker to take more and more steps.
 * But how many more steps?
 * Use RandomWalkers.java to formulate a hypothesis
 * as to how the average number of steps grows as a function of r.
 *
 * Estimating an unknown quantity by generating random samples and aggregating the results
 * is an example of Monte Carlo simulation—a powerful computational technique
 * that is used widely in statistical physics, computational finance, and computer graphics.
 */

public class RandomWalkers {
    //              North (2)
    //                x,y+1
    //                  |
    //     x-1,y  --   x,y  --  x+1,y
    //     West (1)     |      East (0)
    //                x,y-1
    //              South (3)

    public double averageStepsTakenByRandomWalker(int r, int trials) {

        int totalNumSteps = 0;
        double averageNoOfSteps;
        int currentDistance = 0;

        int xx = 0;
        int yy = 0;
        int stepsTaken = 0;

        //step 4: Make sure the experiments don't exceed the number of trials
        for (long i = 0; i < trials; i++) {
            //step 3: while we haven't reached the ManhattanDistance keep taking random steps and calculating the steps taken

            while ( currentDistance != r) {
                // generates the random direction the walker wishes to take
                int randomDirection = generateRandomNum();
                if (randomDirection == 0) {//North
                    yy++;
                } else if (randomDirection == 1) {//south
                    yy--;
                } else if (randomDirection == 2) {//East
                    xx++;
                } else if (randomDirection == 3) {//west
                    xx--;
                }
                currentDistance = getDistance(xx,yy);
                stepsTaken++; //steps taken to reach ManhattanDistance r
                System.out.println(stepsTaken);
            }
            //step 5: calculating the steps totalled with every trial
            totalNumSteps += stepsTaken;
            System.out.println("Total steps Taken are: " + totalNumSteps);
        }
        // taking the average number of steps
        averageNoOfSteps = totalNumSteps / (double)trials; //
        System.out.println("average number of steps = " + averageNoOfSteps);
        return averageNoOfSteps;
    }

    //step 1: Generate a random direction to take the random step from point(0,0)
    public int generateRandomNum(){
        int direction;
        Random random = new Random();
        direction = random.nextInt(4);
        return direction;
    }
    //step 2: get distance between starting point (0,0) and current point(xx,yy)
    public int getDistance(int xx,int yy) {
        int x =0; int y=0;
        int distance = Math.abs(x - xx) + Math.abs(y - yy); // x and y are initial coordinates

        return distance;
    }

    public static void main(String[] args) {
        RandomWalkers object = new RandomWalkers();
        object.averageStepsTakenByRandomWalker(5,1000000);
    }
}
