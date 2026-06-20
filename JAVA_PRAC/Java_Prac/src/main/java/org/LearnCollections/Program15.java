package org.LearnCollections;

import java.util.*;

public class Program15 {
    public static void main(String[] args) {
        Map<Character,Integer> a=new HashMap<>();
        a.put('a',1);
        a.put('b',2);
        a.put('c',3);
        a.put('d',4);
        System.out.println(a.keySet());
        System.out.println(a.values());
        Collection<Integer> c= a.values();
        System.out.println(c);
        System.out.println(a.entrySet());
        Set<Map.Entry<Character, Integer>> d=a.entrySet();
        System.out.println(d);
        for(Map.Entry<Character, Integer> g:d){
            System.out.println(g.getKey());
            System.out.println(g.getValue());
        }
    }
}
