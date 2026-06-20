package org.examples2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LearnStreams {
    public static void main(String[] args) {
        List<Integer> numbersList= Arrays.asList(15,20,35,40,50);
//        List<Integer> newNumbersList = numbersList.stream().filter(n->n%2==0).collect(Collectors.toList());
//        System.out.println(newNumbersList);

        numbersList.stream().filter(n->n%2==0).forEach(n-> System.out.print(n+" "));
    }
}
