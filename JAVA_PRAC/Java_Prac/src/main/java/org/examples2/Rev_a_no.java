package org.examples2;

public class Rev_a_no {
    public static void main(String[] args) {
        int a = 123;
        int rev = 0;
        int temp = a;
        int rem;
        while (temp != 0) {
            rem = temp % 10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        System.out.println(rev);
    }
}

