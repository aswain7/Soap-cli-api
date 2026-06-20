package org.LearnCollections;

import java.util.HashMap;
import java.util.Map;

public class Program17 {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 2, 3, 3, 4};
        //Find the most frequent element
        HashMap<Integer, Integer> h1 = new HashMap<>();
        for (int i : a) {
            h1.put(i, h1.getOrDefault(i, 0) + 1);
        }
        System.out.println(h1);
        int max = 0;
        int element=0;
        for (Map.Entry<Integer, Integer> m1 : h1.entrySet()) {
               if( m1.getValue()>max){
                   max= m1.getValue();
                    element=m1.getKey();
               }
        }
        System.out.println(element);


    }
}
