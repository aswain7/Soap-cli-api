package org.examples2;

import java.util.Random;

public class CreateRandom {
    public static void main(String[] args) {
        Random r1=new Random();
        int no=r1.nextInt(10);
        System.out.println(no);
    }
}
