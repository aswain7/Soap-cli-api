package org.concepts;

public class Encaps {
    private int a;

    public void setValue(int a){
        this.a=a;
    }
    public int getValue(){
        return a;
    }
    public static void main(String[] args) {
        Encaps e =new Encaps();
        e.setValue(10);
        System.out.println(e.getValue());
    }
}
