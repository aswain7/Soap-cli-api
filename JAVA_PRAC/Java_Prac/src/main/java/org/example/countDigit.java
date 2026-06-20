package org.example;

public class countDigit {
    public static void main(String[] args) {
        int no=143;
        int count=0;
        while(no!=0){
            no=no/10;
            count=count+1;
        }
        System.out.println(count);
    }
}
