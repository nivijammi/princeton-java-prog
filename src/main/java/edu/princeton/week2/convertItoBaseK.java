package edu.princeton.week2;

import com.sun.org.apache.xpath.internal.objects.XString;
import sun.jvmstat.perfdata.monitor.PerfStringVariableMonitor;

/*
1.3.21 Write a program Kary that takes two integer command line arguments i and k and converts i to base k.
Assume that i is an integer in Java’s long data type and that k is an integer between 2 and 16.
For bases greater than 10, use the letters A through F to represent the 11th through 16th digits, respectively.
converting base 10 into other bases : https://www.youtube.com/watch?v=aeLLTOHZnIc
// Convert input number is given base by repeatedly
// dividing it by base and taking remainder: https://www.youtube.com/watch?v=gvJYNAiwOhc

ex: 11 base 10 = 102 base 3
11 base 10 = 1.3^2 + 0.3^1 + 2.3^0

 */
public class convertItoBaseK {
    //negative values are ignored
    //digits in the switch statement should be shifted down by 1: 10 -> a, 11 -> b, .. 15 -> f
    //the conversion to the string is missing, the code is printing digits one by one


    public String converterMethod(int i, int k) {

        //we need to keep the original input of i
        int originalI = i;

        // greater than base 10 integers need to be represented using string
        StringBuilder sb = new StringBuilder();

        // make sure negative values are ignored
        while (originalI > 0) {
            // collect the remainders
            int remainder = originalI % k;

            if (remainder < 10) {
                sb.append(remainder);

            }
            // the remainder greater than 9 needs to map to their alphabets ex: 10->'A'
            // switch case would be convenient for the use of letters A through F to represent the 11th through 16th digits

            switch (remainder) {
                case 10:
                    sb.append("a");
                    break;
                case 11:
                    sb.append("b");
                    break;
                case 12:
                    sb.append("c");
                    break;
                case 13:
                    sb.append("d");
                    break;
                case 14:
                    sb.append("e");
                    break;
                case 15:
                    sb.append("f");
                    break;
            }
            originalI /= k;// originalI = originalI / k
        }


        //the extracted digits collected need to be reverse

       // String result = sb.reverse().toString();
        String newString = sb.toString();
        String result = reverseString(newString);
        System.out.println(i + " " + "when converted from base 10 to base" + " " + k + " " + "is" + " " + result);
        return sb.toString();
    }

    public String reverseString(String s){

        String result ="";
        int length = s.length();
        for (int j = 0; j < length; j++) {
            char ch = s.charAt(j); // extracts each char
            result = ch + result;// adds each char in the front of the existing string
        }

        return result;
    }

    public static void main(String[] args) {
        convertItoBaseK baseK = new convertItoBaseK();
        //baseK.converterMethod(1206,16);
        baseK.converterMethod(823,8);

    }

}
