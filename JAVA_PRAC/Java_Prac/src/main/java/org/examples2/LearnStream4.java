package org.examples2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LearnStream4 {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("ramesh","Soumya","shaswati","aranya");
//        names.stream().map(n->n.length()).forEach(n-> System.out.println(n));
       List<String> namecount= names.stream().filter(n->n.length()>6).map(n-> n +"-"+n.length()).collect(Collectors.toList());
        System.out.println(namecount);
    }
}