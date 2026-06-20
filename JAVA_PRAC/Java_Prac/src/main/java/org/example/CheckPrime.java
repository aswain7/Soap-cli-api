package org.example;

public class CheckPrime {
    public static void main(String[] args) {
         for(int no=3;no<=100;no++){
        boolean status = false;
        for (int i = 2; i <= no - 1; i++) {
            if (no % i == 0) {
                status = true;
                break;
            }
        }
        if (status == false) {
            System.out.println(no);
        }

        }
    }
}
