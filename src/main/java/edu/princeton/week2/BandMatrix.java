package edu.princeton.week2;
/**
 Band matrices. Write a program BandMatrix.

 - BAND MATRIX is a matrix that have all elements 0 except a band on the main diagonal.
 - When you have a band of Astrix below and above it is called Tri-Diagonal matrix because if you are to measure the width of the diagonal it is going to be 3 tall

 java that takes two integer command-line arguments n and width
 and prints an n-by-n pattern like the ones below,
 with a zero (0) for each element whose distance from the main diagonal is strictly more than width,
 and an asterisk (*) for each entry that is not,and two spaces between each 0 or *.
 (distance means the minimum number of cells you have to move
 (either left, right, up, or down) to reach any element on the main diagonal).
 */

public class BandMatrix {
    public void bandMatrix(int n , int width){

        // forms nxn patterns

        for(int i=0; i<n; i++){ // row index
            for(int j=0;j<n;j++){ // col index
                if(j==i || Math.abs(i-j) <= width){ // calculates the distance of each element from its main diagonal
                    System.out.print("*" + " ");// if the distance between i and j is equal or the diff is less than or equal to width
                }
                else{
                    System.out.printf("0" + " ");// for each element whose distance from the main diagonal is more than width,
                }

            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        BandMatrix object = new BandMatrix();
        object.bandMatrix(8,0);
    }
}
