package org.examples2;

public class LinearSearch {
    public static void main(String[] args) {
        int a[]={2,4,5,6,8,9};
        int exp=8;
        int count=0;
        for(int i:a){
            count=count+1;
            if(i==exp){
                System.out.println("element found :"+count);
            }
        }

    }
}
