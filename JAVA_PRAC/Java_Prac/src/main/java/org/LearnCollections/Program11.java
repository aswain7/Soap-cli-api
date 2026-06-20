package org.LearnCollections;

import java.util.HashMap;

public class Program11 {
    public static void main(String[] args) {
        //find the first non repeating charcter
        String s1="aabbcccccczddeeff"; //c
        HashMap<Character,Integer> h1=new HashMap<>();
        for(char s:s1.toCharArray()){
            h1.put(s,h1.getOrDefault(s,0)+1);
        }
        for(char s2:s1.toCharArray()){
            if(h1.get(s2)==1){
                System.out.println(s2);
                break;
            }
        }

    }
}
