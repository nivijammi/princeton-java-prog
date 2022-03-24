package edu.princeton.week1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RightTriangleSideLengthTest {

    @Test
    public void findIfATriangleIsRightAngleTriangle1() {
        RightTriangleSideLength sl = new RightTriangleSideLength();

        boolean actual = sl.sideLength(3,4,5);
        assertTrue(actual);

    }
    @Test
    public void findIfATriangleIsRightAngleTriangle2() {
        RightTriangleSideLength sl = new RightTriangleSideLength();

        boolean actual = sl.sideLength(13,12,5);
        assertTrue(actual);

    }
    @Test
    public void findIfATriangleIsRightAngleTriangle3() {
        RightTriangleSideLength sl = new RightTriangleSideLength();

        boolean actual = sl.sideLength(1,2,3);
        assertFalse(actual);

    }
    @Test
    public void findIfATriangleIsRightAngleTriangle4() {
        RightTriangleSideLength sl = new RightTriangleSideLength();

        boolean actual = sl.sideLength(-3,4,-5);
        assertFalse(actual);
    }



}
