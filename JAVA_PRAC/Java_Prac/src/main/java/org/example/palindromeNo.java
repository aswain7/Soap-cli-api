package org.example;

public class palindromeNo {
    public static void main(String[] args) {
        int no=121;
        int temp=no;
        int rev=0;
        int rem;
        while(temp!=0){
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if(rev==no){
            System.out.println("palindrome Number");
        }
    }

}
