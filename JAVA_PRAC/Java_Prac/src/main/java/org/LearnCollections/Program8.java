package org.LearnCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Program8 {
    public static void main(String[] args) {
        //Reverse an array list
        List<Integer> a1 = Arrays.asList(1, 2, 3, 4, 5);
        Collections.reverse(a1);
        int max=Collections.max(a1);
        int min=Collections.min(a1);
        System.out.println(a1);
        System.out.println(max);
        System.out.println(min);


    }
}