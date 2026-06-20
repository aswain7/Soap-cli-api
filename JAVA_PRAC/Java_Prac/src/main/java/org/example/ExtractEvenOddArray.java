package org.example;

public class ExtractEvenOddArray {
    public static void main(String[] args) {
        int a[]={1,2,8,4,5,6};
//        for(int i=0;i<a.length;i++){
//            if(a[i]%2==0){
//                System.out.println("Even " +a[i]);
//            }
//            else{
//                System.out.println("Odd " +a[i]);
//            }
//        }

        StringBuilder even_no=new StringBuilder();
        StringBuilder odd_no=new StringBuilder();

        for(int i=0;i<=a.length-1;i++){
            if(a[i]%2==0){
                even_no.append(a[i]).append(" ");
            }
            else{
                odd_no.append(a[i]+" ");
            }
        }
        System.out.println(even_no);
        System.out.println(odd_no);

    }
}
