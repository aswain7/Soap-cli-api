package org.LearnCollections;

import java.util.Stack;

public class Program2 {
    public static void main(String[] args) {
        //Reverse a string using Stack
        String s= "Deepak";
        Stack<Character> rev=new Stack<>();
        for(char c:s.toCharArray()){
            rev.add(c);
        }
        while(!rev.isEmpty()){
            System.out.println(rev.pop());
        }
    }
}
