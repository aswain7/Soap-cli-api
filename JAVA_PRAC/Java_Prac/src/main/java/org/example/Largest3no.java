package org.example;

public class Largest3no {
    public static void main(String[] args) {
        int[] a={10,20,80,40,50,60};
        int largest=0;
        for(int i=0;i<a.length-1;i++){
              if(a[i]<a[i+1]){
               largest=a[i+1];
              }
              else{
                  break;
              }
        }
        System.out.println(largest);







    }
}
