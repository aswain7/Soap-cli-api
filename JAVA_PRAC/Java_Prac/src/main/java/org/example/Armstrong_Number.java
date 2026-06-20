package org.example;

public class Armstrong_Number {
    public static void main(String[] args) {
        int number=153;
        int temp=number;
        //length of the number
        int length=0;
        while(temp!=0){
            temp=temp/10;
            length=length+1;
        }
        //multiply each digits with the length no of times with themselves
        int sum=0;
        temp=number;
        while(temp!=0){
            int rem=temp%10;
            int power=1;
            for(int i=0;i<length;i++){
                power=power*rem;
            }
            temp=temp/10;
            sum=sum+power;

        }
        System.out.println(sum);
        if(sum==number){
            System.out.println("No is Armstrong");
        }
        else{
            System.out.println("No is not Armstrong");
        }
    }
}
