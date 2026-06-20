package org.example;

import java.util.HashMap;

public class OccuranceOfChar {
    public static void main(String[] args) {
        String s="madam";
        //m-2
        //a-2
        //d-1
        char[] c=s.toCharArray();
        HashMap<Character,Integer> h1=new HashMap<>();
        for(char c1:c){
            h1.put(c1,h1.getOrDefault(c1,0)+1);


        }
        for(char c2:h1.keySet()){
            System.out.println(c2+"-->"+h1.get(c2));
        }


    }
}
