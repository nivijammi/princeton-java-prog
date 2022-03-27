package edu.princeton.week2;

/**
    Generalized harmonic numbers: Write a program GeneralizedHarmonic.java
    that takes two integer command-line arguments n and r and uses
    a for loop to compute the nth generalized harmonic number of order r,
    which is defined by the following formula:
    H(n,r) = 1/1^r + 1/2^r+...+ 1/n^r

    example: H(3,2) = 1/1^2 + 1/2^2 + 1/3^2 = 49/36 = 1.361111
 */
public class GeneralizedHarmonicNumbers {

    public double computeNthGeneralizedHarmonicNum(int base, int exponent){
        double harmonicNum=0;
        double denomnator=0;

        for(int i=1; i<=base; i++){
            denomnator = Math.pow(i, exponent);
            harmonicNum = harmonicNum + 1/denomnator;
        }
        System.out.println(harmonicNum);
        return harmonicNum;
    }

    public double computeNthGeneralizedHarmonicNum2(int base, int exponent){
        double harmonicNum=0;
        double denominator=1;

        for(int i=1; i<=base; i++){
            for (int j =0; j<exponent;j++){
                denominator = denominator*i ;
            }
            harmonicNum = harmonicNum + 1/denominator;
            denominator=1;
        }
        System.out.println(harmonicNum);
        return harmonicNum;
    }
}
