package edu.princeton.week3;

/**
 * https://www.youtube.com/watch?v=_izWx8bScZM
 * Thue–Morse weave. Write a program ThueMorse.java that takes an integer command-line argument n and
 * prints an n-by-n pattern like the ones below. Include two space characters between each + and - character.
 */

public class ThueMorse {

    public void thueMorseWeave(int n) {
        //step 2: print nxn matrix
        String sequence = thueMorseSequence(n);
        for(int i = 0; i<n; i++){
            char charAtI = sequence.charAt(i);
            for (int j =0;j<n;j++){
                if(sequence.charAt(j) == charAtI){
                    System.out.printf("+" + "  ");
                }else{
                    System.out.printf("-" + "  ");
                }
            }
            System.out.println();
        }
    }

    public String thueMorseSequence(int n){
        // step 1: create Thue-Morse Sequence
        String sequence = "01";
        String reverseSequence = "";

        if(n==2){
            return sequence;
        }

        while(sequence.length() < n){

            for (int i = 0; i < sequence.length(); i++) {
                if (sequence.charAt(i) == '0') {
                    reverseSequence = reverseSequence + "1";
                } else {
                    reverseSequence = reverseSequence + "0";
                }
            }
            sequence = sequence + reverseSequence;
            reverseSequence = "";
        }
        System.out.println(sequence);
        return sequence;
    }

    public static void main(String[]args){
        ThueMorse object = new ThueMorse();
        object.thueMorseWeave(8);
    }
}
