package org.examples2;

public class Duplicates_Array {
    public static void main(String[] args) {
        int[] a={1,4,6,7,4,6,9};
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    System.out.println("Duplicate found "+a[i]);
                }
            }
        }
    }
}
