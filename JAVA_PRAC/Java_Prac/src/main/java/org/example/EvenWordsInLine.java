package org.example;

public class EvenWordsInLine {
    public static void main(String[] args) {
        String s="i am a good boy"; //2
        int count=0;
        String[] s1=s.split(" ");
        for(int i=0;i<=s1.length-1;i++){
            if(s1[i].length()%2==0){
                count=count+1;
                System.out.println(s1[i]);
            }

        }
        System.out.println(count);

    }
}
