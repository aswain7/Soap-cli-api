package org.examples2;

public class Count_no_of_odd {
    public static void main(String[] args) {
        int no=5467;
        int temp=no;
        int rem;
        while(temp!=0){
            rem=temp%10;
            temp=temp/10;
            if(rem%2!=0){
                System.out.println("Odd no are "+rem);
            }
        }

    }
}
