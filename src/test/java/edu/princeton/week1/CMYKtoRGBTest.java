package edu.princeton.week1;

import org.junit.Test;

import static org.junit.Assert.*;

public class CMYKtoRGBTest {
    @Test
    public void ConvertMagentaToRGB() {

        CMYKtoRGB tc = new CMYKtoRGB();
        int[] expected = {255,0,255};
        int[] actual = tc.magentaToRGB(0.0, 1.0,0.0,0.0);
        assertArrayEquals(expected,actual);

    }
    @Test
    public void PrincetonOrangeToRGB() {

        CMYKtoRGB tc = new CMYKtoRGB();
        int[] expected = {255,143,0};
        int[] actual = tc.magentaToRGB(0.0,0.4392156862745098,  1.0, 0.0);
        assertArrayEquals(expected,actual);

    }
}