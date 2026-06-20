package org.example;

public class lenLastWordInString {
    public static void main(String[] args) {
        String s="   Hello    World   "; // output as 5
        s=s.trim();
        int count=0;
        char[] charArray=s.toCharArray();
        for(int i=charArray.length-1;i>=0;i--){
            if(charArray[i]!=' '){
                count=count+1;
            }
            else{
                System.out.println(count);
                break;
            }
        }
    }
}
