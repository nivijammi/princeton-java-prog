package edu.princeton.week3;

import java.util.Arrays;

/**https://coursera.cs.princeton.edu/introcs/assignments/arrays/specification.php
 * Discrete distribution. Write a program DiscreteDistribution.java
 * that takes an integer command-line argument m,
 * followed by a sequence of positive integer command-line arguments a1,a2,…,an
 * <p>
 * a1...an , and prints m random indices (separated by whitespace),
 * choosing each index i
 * with probability proportional to ai
 * // https://youtu.be/qIzC1-9PwQo?t=355
 *
 * Understanding: we have a line and the arguments we pass divide the line into segments and give weight to them
 * in the example, the line is divided into (s1,s2,s3..sn) with weights 1,2,3,4,5,6
 * After we generate the random num r, we need to find in which section it fall under(using partial sum) 0-3 section 1, 4-6(section 2),7-9 section 3
 * The indexes returned are the indexes of these section if r ==4, it lies in section 2, sp index returned is 2
 * m is the total number of indexed found.
 */

public class DiscreteDistribution{
    int index =1;
    public void uniqueIndex(int[]n){

        //Step1: get the cumulative sum array from array n
        //Si=a1+a2+…+ai,withS0 =0.
        int totalCount = 0;
        int [] cumulativeSum = new int [n.length];
        for (int i = 1; i < n.length; i++) {
            totalCount = totalCount + n[i];
            cumulativeSum[0] = 0;
            cumulativeSum[i] = cumulativeSum[i-1] + n[i];
        }


        //step 2:generate random integer r uniformly between 0 and Sn−1
        for(int m =0; m<n[0];m++) { // while loop can also be used,m is 10 here
            //generate a number between 0-totalCount
            int r = (int) (totalCount * Math.random());
            //System.out.println(r);

            // step 3: generate unique index i,between 1 and n such that Si−1≤r<Si
            for (int i = 1; i < n.length; i++) {
                if (cumulativeSum[i - 1] <= r && r < cumulativeSum[i]) {
                    index = i;
                }
            }
            //System.out.println(Arrays.toString(cumulativeSum));
            System.out.println("for random number " + r + "the unique index is: " + " " + index + " ");
        }


    }

    public static void main(String[] args) {
        DiscreteDistribution object = new DiscreteDistribution();
        int n[] = {10,10,10,10,10,10,50};//here n[0] is m...times you want the random no. to be generated and given to a unique index.
        object.uniqueIndex(n);
    }

}