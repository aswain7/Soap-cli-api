package org.example;

import java.util.Arrays;

public class reverseSpecificWord {
    public static void main(String[] args) {
        String s="I am a good Boy";// I ma a doog boy
        String[] s1= s.split(" ");
        String empty="";
        for(String s2:s1){

            if(s2.equals("am") || s2.equals("good")){
               //reverse logic
                char[] c1=s2.toCharArray();
                for(int i=s2.length()-1;i>=0;i--){
                    empty=empty+c1[i];
                }
                empty=empty+" ";
            }
            else{
                empty=empty+s2+" ";
            }
        }
        System.out.println(empty);

    }
}
