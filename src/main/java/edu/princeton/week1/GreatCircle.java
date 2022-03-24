package edu.princeton.week1;
/*
(Geometry: great circle distance) The great circle distance is the distance between
two points on the surface of a sphere. Let (x1, y1) and (x2, y2) be the geographical
latitude and longitude of two points. The great circle distance between the two
points can be computed using the following formula:
d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))

https://www.mathsisfun.com/geometry/radians.html

Write a program that takes latitude and longitude of two
points on the earth in degrees and displays its great circle distance. The average
earth radius is 6,371.01 km. Note that you need to convert the degrees into radians
using the Math.toRadians method since the Java trigonometric methods use
radians. The latitude and longitude degrees in the formula are for north and west.
Use negative to indicate south and east degrees. Here is a sample run: */

public class GreatCircle {

    // Lat and Long are expressed in degrees
    // These points will be converted to radians before calculating the distance.
    public double DistanceBetweenLatAndLong(double lat1, double lon1, double lat2, double lon2) {
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);

        double earthRadius = 6371.01; //Kilometers
        // formulae to calculate distance between two points.
        double distance = earthRadius * Math.acos(Math.sin(lat1)*Math.sin(lat2) + Math.cos(lat1)*Math.cos(lat2)*Math.cos(lon1 - lon2));
        System.out.println(distance);
        return distance;
    }

    public static void main(String[] args) {
        GreatCircle gc = new GreatCircle();
        gc.DistanceBetweenLatAndLong(40.35, 74.65, 48.87, -2.33);

    }
}
