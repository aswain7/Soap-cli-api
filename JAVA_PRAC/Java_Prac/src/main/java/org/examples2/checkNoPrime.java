package org.examples2;

public class checkNoPrime {
    public static void main(String[] args) {
        int a=15;
        int count=0;
        if(a>1){
            for(int i=1;i<=a;i++){
                if(a%i==0){
                    count=count+1;
                }
            }
            if(count>2){
                System.out.println("No is not prime ");
            }
            else{
                System.out.println("No is prime");
            }
        }
    }
}
