package org.examples2;

public class Prime_no {
    //no which is a factor of 1 and the no itself and 1 is not a prime no
        //2,3,5,7,11,13,17
    public static void main(String[] args) {
         int n=100;
         for(int i=2;i<=n;i++){
             for(int j=2;j<i;j++){
                 if(i%j!=0){
                     System.out.print(i+" ");
                 }
             }
         }
    }
}
