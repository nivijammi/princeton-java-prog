package edu.princeton.week3;

/**
 * Suppose that people enter a room one at a time. How people must enter until two share a birthday?
 * Counterintuitively, after 23 people enter the room, there is approximately a 50–50 chance that two share a birthday.
 * This phenomenon is known as the birthday problem or birthday paradox.
 *
 * https://www.youtube.com/watch?v=KtT_cgMzHx8
 *
 * Write a program Birthday.java that takes two integer command-line arguments n and trials
 * and performs the following experiment, trials times:
 *
 * Choose a birthday for the next person, uniformly at random between 0 and n−1.
 * Have that person enter the room.
 * If that person shares a birthday with someone else in the room, stop; otherwise repeat.
 * In each experiment, count the number of people that enter the room.
 * Print a table that summarizes the results (the count i, the number of times that exactly i people enter the room,
 * and the fraction of times that i or fewer people enter the room) for each possible value of i from 1
 * until the fraction reaches (or exceeds) 50%.
 */

public class Birthday {
    public void howManyEnterUntilTwoShareABirthday(int n, int trials) {

        boolean[] birthdayArray = null; //birthdays encountered in a single experiment
        int[] timesCollisionsHappen = new int[n + 2];// number of times two people entered the room with same birthday

        // for each number of trials/experiments how many people needed to compared before a match is found.
        for (int j = 0; j < trials; j++) {
            birthdayArray = new boolean[n];// resetting the array for every fresh experiment

            // generating random birthday for every person entering the room
            for (int i = 0; i < n; i++) { //n is the number of people
                int random = (int) (Math.random() * (n-1));
                //System.out.println(random);
                if (!birthdayArray[random]) {
                    birthdayArray[random] = true;
                } else {
                    timesCollisionsHappen[i]++;
                    break;
                }
            }
        }
        fractionResult(trials, timesCollisionsHappen);
    }

    public void fractionResult(int trials, int[] timesCollisionsHappen) {
        int people =1;
        double probability = 0.0;
        double totalCollisions = 0.0;
        while (probability < 0.5){ // till fraction exceeds half
            totalCollisions += timesCollisionsHappen[people-1];// probability *= 1 - ((365-people)/ 365)
            probability = totalCollisions/ trials;
            //among 1 million trials fraction in which first duplicate birthday happen before 1-nth people entered the room
            System.out.println("for " + people + " people in the room   " + totalCollisions + "   "+ "the probability is " +  probability);

            people++;
        }
    }


    public static void main(String[] args) {
        Birthday object = new Birthday();
        object.howManyEnterUntilTwoShareABirthday(31,1000000);
    }
}
