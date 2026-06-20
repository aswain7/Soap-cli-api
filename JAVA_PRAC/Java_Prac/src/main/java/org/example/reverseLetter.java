package org.example;

import java.util.Arrays;

public class reverseLetter {
    public static void main(String[] args) {
        String s="1ab2";
        char[] c=s.toCharArray();
        System.out.println(c);
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(!Character.isLetter(c[left])){
                left++;
            } else if (!Character.isLetter(c[right])) {
                right--;
            }
            else{
                char temp=c[left];
                c[left]=c[right];
                c[right]=temp;
                left++;
                right--;
            }
        }
        System.out.println(c);
    }
}
