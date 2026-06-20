package org.LearnCollections;

import java.util.HashMap;
import java.util.Map;

public class Program10 {
    public static void main(String[] args) {
        Map<Character,Integer> m2=new HashMap<>();
        m2.put('a',1);
        m2.put('b',2);
        m2.put('c',3);
        System.out.println(m2.containsValue(1));
    }
}
