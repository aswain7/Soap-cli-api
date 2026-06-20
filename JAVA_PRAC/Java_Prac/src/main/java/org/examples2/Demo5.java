package org.examples2;

import java.util.function.Function;

public class Demo5 {
    public static void main(String[] args) {
        int[] a={1,4,5,6,7,8,9};
        Function<Integer,Integer> fn1= b -> (b+10);
        for(int c:a){
            System.out.println(fn1.apply(c));
        }

    }
}
