package org.concepts;

public class Demo2 {
    public static void main(String[] args) {
        int age = 15;

        if (age < 18) {
    throw new ArithmeticException("Not eligible to vote");
////            System.out.println("Not eligible to vote");
        }
        else {

            System.out.println("Eligible");
        }
        System.out.println("This is the end");
    }
}
