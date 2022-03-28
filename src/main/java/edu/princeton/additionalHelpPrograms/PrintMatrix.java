package edu.princeton.additionalHelpPrograms;

public class PrintMatrix {
    public void printMatrix(int n){
        int num =0;
        for(int row =0;row<n;row++){
            for(int col = 0; col<n;col++){
                System.out.print(num+ " ");
                num++;
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        PrintMatrix object = new PrintMatrix();
        object.printMatrix(3);
    }
}
