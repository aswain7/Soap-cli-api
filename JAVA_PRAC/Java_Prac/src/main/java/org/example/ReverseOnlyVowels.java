package org.example;

public class ReverseOnlyVowels {
    public static void main(String[] args) {
        String s="Heulloa";
        char[] s1=s.toCharArray();
        String vowels="aeiouAEIOU";
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(vowels.indexOf(s1[left])==-1){
                left++;
            } else if (vowels.indexOf(s1[right])==-1) {
                right--;
            }
            else{
                char temp=s1[right];
                s1[right]=s1[left];
                s1[left]=temp;
                left++;
                right--;
            }
        }
        System.out.println(s1);
    }
}
