package edu.princeton.week1;

import org.junit.Test;

public class UniformJavaNumbersTest {


    @Test
    public void shouldTestMyBehaviour1(){
        UniformJavaNumbers jn = new UniformJavaNumbers();
        jn.randomAverageGenerator(5);
    }
    @Test
    public void shouldTestMyBehaviour2(){
        UniformJavaNumbers jn = new UniformJavaNumbers();
        jn.randomAverageGenerator(10);
    }

}