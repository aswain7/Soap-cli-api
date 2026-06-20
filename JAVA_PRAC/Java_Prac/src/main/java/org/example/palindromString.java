package org.example;

public class palindromString {
    public static void main(String[] args) {
        String s2="rohan";
        String rev="";
        for(int i=s2.length()-1;i>=0;i--){
            rev=rev+s2.charAt(i);
        }
        System.out.println(rev);

    }
}
