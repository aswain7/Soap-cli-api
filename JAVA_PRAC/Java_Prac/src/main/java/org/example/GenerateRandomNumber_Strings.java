package org.example;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class GenerateRandomNumber_Strings {
    public static void main(String[] args) {
        Random rand=new Random();
        int a=rand.nextInt(10);
        System.out.println(a);

        double c=rand.nextDouble();
        System.out.println(c);

        String s= RandomStringUtils.randomAlphabetic(10);
        System.out.println(s);



    }
}

