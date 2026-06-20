package org.LearnCollections;

import java.util.HashSet;
import java.util.Set;

public class Program12 {
    public static void main(String[] args) {
        //Intersection of 2 arrays
        int[] a={1,2,3,4};
        int[] b={3,4,5,6};

        // 3,4
       Set<Integer> s1=new HashSet<>();
       for(int a1:a){
           s1.add(a1);
       }

       for(int b1:b){
           if(s1.contains(b1)){
               System.out.print(b1+" ");
           }
       }


    }
}
