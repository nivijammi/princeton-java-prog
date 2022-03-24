package edu.princeton.week1;

/*Strings and command-line arguments. Write a program HelloGoodbye.java that takes two names as command-line arguments and prints hello and goodbye messages as shown below (with the names for the hello message in the same order as the command-line arguments and with the names for the goodbye message in reverse order).

 */
public class HelloGoodbyeAssign1 {

    public void greetings(String name1, String name2){
        System.out.println("Hello" + " " +name1 + " "+ "and" + " " + name2 + ".");
        System.out.println("Goodbye" + " " +name2 + " "+ "and" + " " + name1 + ".");
    }

    public static void main(String[] args) {
        HelloGoodbyeAssign1 hello = new HelloGoodbyeAssign1();
        hello.greetings("vj", "nivi");

    }
}
