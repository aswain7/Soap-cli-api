package org.examples2;

public class FindPrime {
    public static void main(String[] args) {
        int z=100;
        for(int i=2;i<=z;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count=count+1;
                }
            }
            if(count==2){
                System.out.print(i+" ");
            }
        }
    }

}
