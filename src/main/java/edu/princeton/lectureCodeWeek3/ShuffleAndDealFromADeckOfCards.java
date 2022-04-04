package edu.princeton.lectureCodeWeek3;

/**
 * Problem: Print N random cards from a deck
 * Algorithm: shuffle the deck and deal
 * consider each card index i from 0-51
 *      Calculate a random index r between i and 51.
 *      Exchange deck[i] with deck[r].
 * Print the first N cards in the deck.
 */

public class ShuffleAndDealFromADeckOfCards {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);

        String[] rank = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String[] suit = {"club", "diamond", "heart", "spade"};

        String[] deck = new String[52];
        for(int i=0 ; i<13 ; i++){
            for (int j=0;j<4;j++){
                deck[i+13*j] = rank[i] + suit[j];
            }
        }
        for(int i=0; i<52;i++){
            int r = i + (int) (Math.random() * (52-i));
            String t = deck[r];
            deck[r] = deck[i];
            deck[i] = t;
        }
        for(int i=0;i<N;i++){
            System.out.println(deck[i]);
            System.out.println();
        }

    }
}
