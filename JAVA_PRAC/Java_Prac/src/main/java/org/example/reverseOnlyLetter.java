package org.example;

public class reverseOnlyLetter {
    public static void main(String[] args) {
        String a="1ab2";
        char[] c=a.toCharArray();
        int i=0;
        int j=a.length()-1;
        while(i<j){
            if(!Character.isLetter(c[i])){
                i++;
            } else if (!Character.isLetter(c[j])) {
                j--;

            }
            else{
                char temp=c[i];
                c[i]=c[j];
                c[j]=temp;
                i++;
                j--;
            }
        }
        System.out.println(c);
    }
}
