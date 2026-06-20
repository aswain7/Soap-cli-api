package org.example;

public class Prime {
    public static void main(String[] args) {
        for(int i=2;i<10;i++){
            boolean isprime=true;
            for(int j=2;j<=i-1;j++){
                if(i%j==0){
                    isprime=false;
                }

            }
            if(isprime){
                System.out.print(i+" ");
            }


        }
    }
}
