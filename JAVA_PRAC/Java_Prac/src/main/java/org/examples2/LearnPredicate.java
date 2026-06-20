package org.examples2;

import java.util.function.Predicate;

public class LearnPredicate {
    public static void main(String[] args) {
        Predicate<Integer> p=i->(i>10);
        System.out.println(p.test(20));

        Predicate<Integer> p2=i1->(i1>40);
        System.out.println(p2.test(30));

        Predicate<String> p3=s->(s.equals("Ramesh"));
        System.out.println(p3.test("Ramesh"));
    }
}
