package edu.princeton.week1;
/*
Integers and booleans. Write a program RightTriangle that takes three int command-line arguments and determines whether they constitute the side lengths of some right triangle.
formulae a^2 + b^2 = c^2
 */

public class RightTriangleSideLength {

    public boolean sideLength(int a,int b, int c){
        boolean isRightTriangle = ((a > 0) && (b > 0) && (c > 0)) &&
        (a*a + b*b ==c*c || b*b + c*c == a*a || c*c + a*a == b*b);

        System.out.println(isRightTriangle);
        return isRightTriangle;
        }

}
