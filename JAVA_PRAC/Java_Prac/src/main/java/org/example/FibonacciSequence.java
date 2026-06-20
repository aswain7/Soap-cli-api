package org.example;

public class FibonacciSequence {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int sum;
        System.out.print("First 10 fibonacci sequence "+a+" "+b);
        for(int i=0;i<=7;i++){
            sum=a+b;
            System.out.print(" "+sum);
            a=b;
            b=sum;
        }
    }
}
