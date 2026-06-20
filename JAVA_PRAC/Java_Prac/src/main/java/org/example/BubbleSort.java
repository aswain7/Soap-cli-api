package org.example;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a={10,40,20,30,50}; // 10 20 30 40 50
        for(int i=0;i<=a.length-1;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));

    }
}
