package org.LearnCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Program13 {
    public static void main(String[] args) {
        //Union of Arrays
        int[] a={1,3,4,8};
        int[] b={3,5,2,7};
        List<Integer> s1=new ArrayList<>();
        for(int i:a){
            s1.add(i);
        }
        for(int j:b){
            if(s1.contains(j)){
                continue;
            }
            s1.add(j);
        }
        System.out.println(s1);

    }
}
