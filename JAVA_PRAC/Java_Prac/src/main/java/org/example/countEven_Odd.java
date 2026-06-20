package org.example;

public class countEven_Odd {
    public static void main(String[] args) {
        int a=306;
        int even_Count=0;
        int odd_Count=0;
        while(a!=0){
            int rem=a%10;

            if(rem%2==0){
                System.out.println("Even no "+rem);
                even_Count=even_Count+1;
            }
            else{
                System.out.println("Odd no "+rem);
                odd_Count=odd_Count+1;
            }
            a=a/10;
        }
        System.out.println(even_Count);
        System.out.println(odd_Count);
    }
}
