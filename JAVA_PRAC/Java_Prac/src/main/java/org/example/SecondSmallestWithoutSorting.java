package org.example;

public class SecondSmallestWithoutSorting {
    public static void main(String[] args) {
        int[] s={8,4,6,3,5,2,9}; //3
        int smallestno=Integer.MAX_VALUE;
        int secondsmallestno=Integer.MAX_VALUE;
        for(int no:s){
           if(no<smallestno){
               secondsmallestno=smallestno;
               smallestno=no;

           } else if (no<secondsmallestno && no!=smallestno) {
               secondsmallestno=no;

           }
        }
        System.out.println(secondsmallestno);

    }
}
