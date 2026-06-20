package org.LearnCollections;

import java.util.HashMap;

public class Program3 {
    public static void main(String[] args) {
        //Character Frequency
        String str="automation is my target";
        HashMap<Character,Integer> h1=new HashMap<Character, Integer>();
        for(char c:str.toCharArray()){
            h1.put(c,h1.getOrDefault(c,0)+1);
        }
        System.out.println(h1);

    }
}
