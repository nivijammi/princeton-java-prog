package edu.princeton.lectureCodeWeek3;

/**
 * coupon collector simulation:
 * Generate random int values between 0 and M-1
 * Count number used to generate each value at least once.
 *
 * key to implementation:
 * Create a boolean length M(initially all false by default)
 * When r generated,check the rth value in the array.
 *      if true, ignore it(not new)
 *      if false, count it as new distinct value(and set rth entry to true)
 */

public class CouponCollector {
    public static void main(String[] args) {
        int M = Integer.parseInt(args[0]);
        int cards =0; //number of cards collected
        int distinct =0; // number of unique or distinct cards

        boolean[] found = new boolean[M];
        while (distinct < M){
            int r = (int) (Math.random() * M);
            cards++;
            if(! found[r]){ //not found means we haven't seen it before
                distinct++;
                found[r] = true;
            }
        }
        System.out.println(cards);
    }
}
