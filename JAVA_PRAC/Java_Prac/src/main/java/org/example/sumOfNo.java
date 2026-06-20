package org.example;

public class sumOfNo {
    public static void main(String[] args) {
        int a=1654;
        int temp=a;
        int sum=0;
        while(temp!=0){
            int rem=temp%10;
            sum=sum+rem;
            temp=temp/10;
        }
        System.out.println(sum);
    }
}
