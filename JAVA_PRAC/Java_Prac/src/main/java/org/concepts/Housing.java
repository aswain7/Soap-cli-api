package org.concepts;

public interface Housing {
    public abstract void show();
    default void fight(){
         System.out.println("I am fighting");
     }
     static void rule(){
         System.out.println("I am ruling");
     }
     int a=10;

    public static void main(String[] args) {
        System.out.println(a);
        Loan l =new Loan();
        l.show();
        Housing.rule();
        l.fight();
        Housing h =new Loan();
        h.fight();
        h.show();
        rule();
    }
}

class Loan implements Housing{
    public void show(){
        System.out.println("I am showing");
    }

}
