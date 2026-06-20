package org.LearnCollections;

import java.util.Stack;

public class Program14 {
    public static void main(String[] args) {
        //Balanced Paranthesis
        String str="{{[()]}}}}}}";
        Stack<Character> s1=new Stack<>();
        for(char c:str.toCharArray()){
            if (c == '{' || c=='[' || c=='(') {
                s1.push(c);
            }
            else if(c == '}' || c==']' || c==')'){
                if(s1.isEmpty()){
                    System.out.println("Not Balanced");
                    return;
                }
                s1.pop();
            }
        }
        if(s1.isEmpty()){
            System.out.println("Balanced Paranthesis");
        }
        else{
            System.out.println("Its not balance Paranthesis");
        }

    }
}
