package edu.princeton.week2;
/**
 Band matrices. Write a program BandMatrix.
 java that takes two integer command-line arguments n and width
 and prints an n-by-n pattern like the ones below,
 with a zero (0) for each element whose distance from the main diagonal is strictly more than width,
 and an asterisk (*) for each entry that is not,
 and two spaces between each 0 or *.Here, distance means the minimum number of cells you have to move
 (either left, right, up, or down) to reach any element on the main diagonal.
 */

public class BandMatrix {
    public void bandMatrix(int n , int width){
        int i;
        int j;
        // forms nxn patterns

        for(i=0; i<n; i++){
            for(j=0;j<n;j++){
                if(j==i || Math.abs(i-j) <= width){ //the j's distance is compared with i entry(main diagonal) less than or equal width and prints asterisks *
                    System.out.printf("*" + " ");// true condition displays "*"
                }
                else{
                    System.out.printf("0" + " ");// false displays "0"
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
