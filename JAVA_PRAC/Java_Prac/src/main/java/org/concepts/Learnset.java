package org.concepts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Learnset extends LearnArrayList {
    public static void main(String[] args) {
        Set<Integer> s1=new HashSet<>();
        List<Integer> l1=new ArrayList<>();
        l1.add(50);
        l1.add(60);
        l1.add(70);
        s1.add(10);
        s1.add(20);
        s1.add(20);
        s1.add(30);
        s1.add(40);
        System.out.println(s1);
        s1.addAll(l1);
        System.out.println(s1);
        l1.addAll(s1);
        System.out.println(l1);

    }
}
