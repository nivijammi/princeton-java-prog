package edu.princeton.lectureCodeWeek3;

/**
 * Problem: A dog walks around a random city,
 * never revisiting any intersection.
 * Does the dog escape?
 *
 * Model : a random process in an N-BY-N lattice
 * start in the middle.
 * Move to a random neighbouring intersection,
 * Outcome1 (escape): reach the edge of the lattice.
 * Outcome 2 (dead end) : no unvisited neighbours.
 * using a monte-carlo simulation
 */

public class SelfAvoidingRandomWalks {
    public static void main(String[] args) {
        //int N = Integer.parseInt(args[0]);
        //int trials = Integer.parseInt(args[1]);
        int N = 10;
        int trials = 100;
        int deadEnds =0; // number of times reach a dead end.

        for(int t=0; t<trials; t++){
            boolean[][] a = new boolean[N][N];
            int x = N/2, y = N/2; // co-ordinates for starting point that will be in the middle so N/2

            while (x>0 && x < N-1 && y>0 && y <N-1){ //any of those conditions come true means dog escaped.
                if(a[x-1][y] && a[x+1][y] && a[x][y-1] && a[x][y+1]){//all places visited means dog is stuck
                    deadEnds++;
                    break;
                }
                a[x][y]= true; // dog has been to this intersection
                double r = Math.random();
                //generates random direction
                //if dog hasn't been there then goes there
                if (r<0.25) { if (!a[x+1][y]) x++; }
                else if (r<0.50) { if (!a[x-1][y]) x--; }
                else if (r<0.75) { if (!a[x][y+1]) y++; }
                if (r<0.25) { if (!a[x][y-1]) y--; }
            }
        }
        System.out.println((100*deadEnds/trials + "% dead ends"));
    }
}
