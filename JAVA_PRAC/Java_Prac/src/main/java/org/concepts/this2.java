package org.concepts;

class t3{
    t3(this2 t2){
        System.out.println("I am a constructor");
    }
}


public class this2 {
    void m2(this2 a){
        System.out.println("I am inside m2");
        t3 t=new t3(this);
    }
    void m1(){
        m2(this);
    }
    public static void main(String[] args) {
        this2 t2=new this2();
        t2.m1();
    }
}
