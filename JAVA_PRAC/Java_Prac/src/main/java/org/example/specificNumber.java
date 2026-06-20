package org.example;

public class specificNumber {
    public static void main(String[] args) {
        boolean a=true;
        int no=9;
        for(int i=2;i<no-1;i++){
            if(no%i==0){
               a=false;
               break;
            }
        }
        if(a){
            System.out.println("No is prime");
        }
        else{
            System.out.println("No is not prime");
        }
    }
}
