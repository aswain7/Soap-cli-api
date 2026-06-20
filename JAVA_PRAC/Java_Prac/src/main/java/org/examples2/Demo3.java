package org.examples2;

import java.util.function.Predicate;

public class Demo3 {
    public static void main(String[] args) {
        int[] a={10,20,30,40,50,60,70,5,65,75,85,95,105};
        Predicate <Integer> pe=p->(p%2==0 && p>50);
        for(int a3:a){
            if(pe.test(a3)){
                System.out.println(a3);
            }
        }

    }
}
