package org.examples2;

public class Count_Digits {
    public static void main(String[] args) {
        int a=123;
        int count=0;
        int rem,rev=0;
        int temp=a;
        while(temp!=0){
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
            count=count+1;
        }
        System.out.println(count);
    }
}
