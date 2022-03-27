package edu.princeton.week2;

import org.junit.Assert;
import org.junit.Test;

public class GeneralizedHarmonicNumbersTest {

    @Test
    public void computeNthGHN1() {
        GeneralizedHarmonicNumbers GHN = new GeneralizedHarmonicNumbers();
        double expected = 1.3611111111111112;
        double actual = GHN.computeNthGeneralizedHarmonicNum(3,2);
        Assert.assertEquals(expected, actual, expected-actual);
    }

    @Test
    public void computeNthGHN2() {
        GeneralizedHarmonicNumbers GHN = new GeneralizedHarmonicNumbers();
        double expected = 1.3611111111111112;
        double actual = GHN.computeNthGeneralizedHarmonicNum2(3,2);
        Assert.assertEquals(expected, actual, expected-actual);
    }
}