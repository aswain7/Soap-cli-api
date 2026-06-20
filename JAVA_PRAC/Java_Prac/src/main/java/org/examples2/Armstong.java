package org.examples2;

public class Armstong {
    public static void main(String[] args) {
        //153 is an armstrong no
        int a = 153;
        int temp = a;
        int rem;
        int totalsum = 0;
        int length = 0;
        while (a != 0) {
            a = a / 10;
            length = length + 1;
        }
        while (temp != 0) {
            int ind=1;
            rem = temp % 10;
            for (int i = 0; i < length; i++) {
                ind = ind * rem;
            }
            temp=temp/10;
            totalsum = totalsum + ind;

        }
        System.out.println(totalsum);
    }
}
