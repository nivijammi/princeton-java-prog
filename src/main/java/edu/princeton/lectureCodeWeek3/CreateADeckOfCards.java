package edu.princeton.lectureCodeWeek3;
//Create a deck of cards

import java.sql.SQLOutput;

public class DeckOfCards {
    public static void main(String[] args) {
        String[] rank = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String[] suit = {"club", "diamond", "heart", "spade"};

        String[] deck = new String[52];
        for(int j=0 ; j<4 ; j++){
            for (int i=0;i<13;i++){
                deck[i+13*j] = rank[i] + suit[j];
            }
        }
        for(int i=0; i<52;i++){
            System.out.println(deck[i] + " ");
        }
        System.out.println();
    }
}
