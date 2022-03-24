package edu.princeton.week1;

/*
1.2.30 Uniform random numbers. Write a program that prints five uniform random numbers between 0 and 1, their average value, and their minimum and maximum values. Use Math.random(), Math.min(), and Math.max().

 */

public class UniformJavaNumbers {



    public double randomAverageGenerator(int count) {
        double sum =0;
        double  min = 1;//taken as 1 so that 1st element becomes the minimum number
        double  max = 0;
        double average;


        for (int i = 0; i < count; i++) {

            // generating a randomNumber number between 0 and 1
            double randomNumber = Math.random();
            System.out.println("Random Number : " + i + "= "+ randomNumber);

            //current max number
            max = Math.max(max, randomNumber);
            //System.out.println("max number between 0-1 is: " + max);

            //current min number
            min = Math.min(min,randomNumber);
            //System.out.println("min number between 0-1 is: " + min);

            // sum of all numbers is
            sum = sum + randomNumber;
            //System.out.println("current sum is " + sum);

        }
        average = sum/ count;
        System.out.println("max number between 0-1 is: " + max);
        System.out.println("min number between 0-1 is: " + min);
        System.out.println("the sum of random numbers is: " + sum);
        System.out.println("average of the numbers is: "+ average);

        return average;
    }

}
