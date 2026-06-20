package org.examples2;

public class rev_A_string {
    public static void main(String[] args) {
        String s="Deepak";
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        System.out.println(rev);

    }
}
