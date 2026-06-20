package org.LearnCollections;

import java.util.Arrays;

public class Program5 {
    public static void main(String[] args) {
        //check Anagram
        String a="silent";
        String b="listen";
        char[] c1=a.toCharArray();
        char[] c2=b.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        String a1=Arrays.toString(c1);
        String b1=Arrays.toString(c2);
        if(a1.equals(b1)){
            System.out.println("Its Anagram");
        }
        else{
            System.out.println("Its not");
        }
    }
}
