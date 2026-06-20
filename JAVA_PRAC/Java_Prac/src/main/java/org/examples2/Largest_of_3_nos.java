package org.examples2;

public class Largest_of_3_nos {
    public static void main(String[] args) {
        int[] a={5,9,2};
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);

    }
}
