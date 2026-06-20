package org.LearnCollections;

import java.util.Arrays;
import java.util.HashMap;

public class Program4 {
    public static void main(String[] args) {
        //Word Frequency in a sentence
        String sentence="java is a easy java is powerful";
        String[] divide=sentence.split(" ");
        HashMap<String,Integer> frequency=new HashMap<>();
        for(String c:divide){
            frequency.put(c,frequency.getOrDefault(c,0)+1);
        }
        System.out.println(frequency);
    }
}
