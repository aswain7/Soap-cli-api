package org.LearnCollections;

import java.util.HashSet;
import java.util.Set;

public class Program7 {
    public static void main(String[] args) {
        //Find Duplicate elements
        int[] a={1,2,3,3,4,1};
        Set<Integer> s1=new HashSet<>();
        Set<Integer> duplicate=new HashSet<>();
        for(int i:a){
            if(!s1.add(i)){
                duplicate.add(i);
            }
        }
        System.out.println(duplicate);
    }
}
