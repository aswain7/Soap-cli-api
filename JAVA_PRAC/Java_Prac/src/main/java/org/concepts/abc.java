package org.concepts;

public class abc {
    static int a=10;
    int b=20;
    void call(){
        System.out.println(b);
    }
    static void display(){
        System.out.println(new abc().b);
    }
    public static void main(String[] args) {
        System.out.println(abc.a);
        System.out.println(new abc().b);
        abc a=new abc();
        a.call();
        abc.display();
    }
}
