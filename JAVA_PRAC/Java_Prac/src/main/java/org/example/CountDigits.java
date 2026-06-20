package org.example;

public class CountDigits {
    public static void main(String[] args) {
        int a=123678;
        int count=0;
        while(a!=0){
            a=a/10;
            count=count+1;
        }
        System.out.println(count);
    }
}
