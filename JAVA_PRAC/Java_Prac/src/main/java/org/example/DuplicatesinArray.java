package org.example;

public class DuplicatesinArray {
    public static void main(String[] args) {
        boolean status=false;
        int duplicate=0;
        int[] a = {1, 2, 3, 4, 9, 3}; //3
        for (int j = 0; j < a.length; j++) {

            for (int i = j+1; i < a.length; i++) {
                if (a[j]==a[i]){
                    duplicate=a[j];
                    status=true;
                }

            }
        }
        if(status){
            System.out.println("Duplicate element found - "+duplicate);
        }
        else{
            System.out.println("No Duplicate element found");
        }
    }
}
