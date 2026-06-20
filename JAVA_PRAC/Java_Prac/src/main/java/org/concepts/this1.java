package org.concepts;


import java.sql.SQLOutput;

class A{
    int x;
    void display(int x){
        this.x=x;
    }
    void dance(){
        System.out.println("I can dance");
    }
    A(){
        System.out.println("I am a constructor");

    }
    A(int a){
        this();
        System.out.println("I am a parameterized constructor");
    }
    void show(){
        System.out.println(x);
        this.display(20);
        System.out.println(x);
        this.dance();

    }


}
public class this1 extends A {

    void shout(){
        System.out.println("I am shouting");
    }
    this1(){
        super();
        System.out.println("I am inside main constructor");
        this.shout();

    }

    public static void main(String[] args) {
        A a1=new A(10);
        a1.display(10);
        a1.show();
        this1 t1=new this1();

    }
}
