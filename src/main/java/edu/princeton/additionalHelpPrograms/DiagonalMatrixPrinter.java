package edu.princeton.additionalHelpPrograms;

public class DiagonalMatrixPrinter {
    public void printDiagonals(int arr[][], int m, int n ) {
        int rowIndex;
        int colIndex;
        int k;
//for loop for diagonals that starts from the first elements of the rows
//variable k denotes the starting of the element in rows
//loop execute till m-1 rowIndex.e. if matrix is m*n (3*3) the loop executes from k=0 to 2
        for (k = 0; k <= m - 1; k++) {
            rowIndex = k; //the first element of the diagonal starts form the k-th row
            colIndex = 0; //the first element of the diagonal starts form the first column
            while (rowIndex >= 0) {
                System.out.print(arr[rowIndex][colIndex] + "\t");
                rowIndex = rowIndex - 1;//decrement rowIndex by 1
                colIndex = colIndex + 1;// increment colIndex by1
            }
            System.out.println();
        }

        //for loop for diagonals that starts from the last elements of the columns
        //every element ends in last column so will execute loop up to n-1 (where n is the number of columns)
        //here, k=1 because avoid to print a diagonal twice
        for (k = 1; k <= n - 1; k++) {
            //here every diagonal starts from the last element of the last row
            rowIndex = m - 1;
            //k iterate the starting element of each diagonal so; we have started colIndex by k rowIndex.e. 1
            colIndex = k;
            while (colIndex <= n - 1) {
                //prints the element
                System.out.print(arr[rowIndex][colIndex] + "\t");
                //getting the next element in the diagonal
                rowIndex = rowIndex - 1;
                colIndex = colIndex + 1;
            }


        }
    }

    public static void main(String[] args) {
        DiagonalMatrixPrinter object = new DiagonalMatrixPrinter();
        int arr[][] = {{3, 7, 9}, {2, 1, 5}, {8, 6, 4}};
        object.printDiagonals(arr,3,3);
    }


}
