package org.example;

public class checkVowels {
    public static void main(String[] args) {
        String s="Amrit Swain";
        String Vowels="aeiouAEIOU";
        int count=0;
        char[] c1=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(Vowels.indexOf(c1[i])!=-1){
                System.out.println(c1[i]);
                count=count+1;
            }
        }
        System.out.println(count);
    }
}
