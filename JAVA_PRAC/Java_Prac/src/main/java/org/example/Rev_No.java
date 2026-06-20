package org.example;

public class Rev_No {
    public static void main(String[] args) {
        int a=123;
        int temp=0;
        int n=a;
        int rev=0;
        int rem;
        while(n!=0){

            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println(rev);


    }
}
