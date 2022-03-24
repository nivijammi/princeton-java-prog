package edu.princeton.week1;
/*
Three-sort. Write a program that takes three integer command-line arguments and prints them in ascending order. Use Math.min() and Math.max().
 */

public class ThreeSort {



    public int getMiddleValue(int one, int two, int three, int smallestValue, int biggestValue) {
        int middleValue = one + two + three - (smallestValue + biggestValue);
        System.out.println(middleValue);
        return middleValue;
    }

    public int getBiggestValue(int one, int two, int three) {
        int biggestValue = Math.max(one,Math.max(two, three));
        System.out.println(biggestValue);
        return biggestValue;
    }

    public int getSmallestValue(int one, int two, int three) {
        int smallestValue = Math.min(one, Math.min(two, three));
        System.out.println(smallestValue);
        return smallestValue;
    }

   public void printAscendingOrder(int one, int two, int three){
       int smallestValue= getSmallestValue(one,two,three);
       int biggestValue = getBiggestValue(one,two,three);
       int middleValue = getMiddleValue(one,two,three,smallestValue,biggestValue);

       System.out.println(smallestValue + " " +  middleValue + " " + biggestValue);

   }

}
