package org.LearnCollections;

import java.util.HashSet;
import java.util.Set;

public class Program6 {
    public static void main(String[] args) {
//Remove duplicates from the Array
        int[] a={1,2,3,3,1,8,9};
        Set<Integer> s1=new HashSet<>();
        for(int i:a){
            s1.add(i);
        }
        System.out.println(s1);
    }
}
