package org.concepts;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnLinkedHashset {
    public static void main(String[] args) {
        Set<Integer> s1=new LinkedHashSet<>();
        s1.add(90);
        s1.add(20);
        s1.add(30);
        s1.add(40);
        s1.add(50);
        System.out.println(s1);
        Set<Integer> s2=new TreeSet<>();
        s2.add(90);
        s2.add(20);
        s2.add(30);
        s2.add(40);
        s2.add(50);
        System.out.println(s2);
    }
}
