package org.concepts;

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<Integer> s1=new Stack<>();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        System.out.println(s1);
        System.out.println(s1.peek());
        System.out.println(s1);
        //remove the top element
        System.out.println("*****");
        System.out.println(s1.pop());
        System.out.println(s1);
        System.out.println(s1.get(2));
        s1.remove(0);    // Remove bottom ❌
        s1.set(1, 99);
        System.out.println(s1);
    }
}
