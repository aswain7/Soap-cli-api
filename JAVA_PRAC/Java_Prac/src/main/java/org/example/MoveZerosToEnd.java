package org.example;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {

        int[] a={1,0,3,0,7,0,9,0,8,8,8};
        int nzindex=0;
        for(int i=0;i<a.length;i++) {
            if (a[i] != 0) {
                int temp = a[i];
                a[i] = a[nzindex];
                a[nzindex] = temp;
                nzindex++;
            }
        }
        System.out.println(Arrays.toString(a));


    }
}
