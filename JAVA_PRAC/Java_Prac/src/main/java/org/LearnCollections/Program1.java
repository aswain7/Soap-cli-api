package org.LearnCollections;

public class Program1 {
    public static void main(String[] args) {
        //Reverse a string
        String s="Deepak"; //kapeeD
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        System.out.println(rev);
    }
}
