package org.examples2;

public class secondLargest {
    public static void main(String[] args) {

        int[] a={1,6,7,8,1,28,90};
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);
        int second_max=0;
        for(int j:a){
            if(j>second_max && j!=max){
                second_max=j;
            }
        }
        System.out.println(second_max);
    }
}
