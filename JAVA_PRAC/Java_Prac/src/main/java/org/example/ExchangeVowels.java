package org.example;

import java.util.Arrays;

public class ExchangeVowels {
    public static void main(String[] args) {
            String s3="Home"; // Hemo
            char[] s=s3.toCharArray();
            String vowels="AEIOUaeiou";
            int i=0;
            int j=s3.length()-1;
            while(i<j){
                if(vowels.indexOf(s[i])<0){
                    i++;
                } else if (vowels.indexOf(s[j])<0) {
                    j--;
                } else if (vowels.indexOf(s[i])>0 && vowels.indexOf(s[j])>0) {
                    char temp=s[i];
                    s[i]=s[j];
                    s[j]=temp;
                    i++;
                    j--;
                }
            }
        System.out.println(s);

    }
}
