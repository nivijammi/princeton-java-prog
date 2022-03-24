package edu.princeton.week1;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/*
Write a program CMYKtoRGB.java that converts from CMYK format to RGB format using these mathematical formulas:

white red green blue=1−black=255×white×(1−cyan)=255×white×(1−magenta)=255×white×(1−yellow) white	=1−black	red	=255×white×(1−cyan)	green	=255×white×(1−magenta)	blue	=255×white×(1−yellow)
Your program must take four double command-line arguments cyan, magenta, yellow, and black; compute the corresponding RGB values, each rounded to the nearest integer; and print the RGB values,
 */

public class CMYKtoRGB {

    public int[] magentaToRGB(double cyan, double magenta, double yellow, double black){
        int[] RGB = new int[3];
        int white = (int) (1-  black);
        int red = (int) (255 * white * ( 1 - cyan));
        int green = (int) (255 * white * (1- magenta));
        int blue = (int) (255 * white * (1- yellow));

        RGB[0] =red;
        RGB[1] = green;
        RGB[2] = blue;

        System.out.println(RGB[0] +" " + RGB[1] + " " + RGB[2]);
        return RGB;
    }

    public void foo(){
        double degrees = 90;
        // converting values to radians
        double radians = Math.toRadians(degrees);

        System.out.println(Math.sin(radians) * Math.cos(radians));


    }


}
