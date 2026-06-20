package org.example;

public class Missing_No_Array {
    public static void main(String[] args) {
        int[] a={1,2,4,5,6};
        int actual_count=0;
        for(int i=0;i<=a.length-1;i++){
            actual_count=actual_count+a[i];
//            System.out.println(actual_count);
        }
        int b=a[0];
        int c=a[a.length-1];
        int real_Count=0;
        for(int j=b;j<=c;j++){
            real_Count=real_Count+j;
        }
//        System.out.println(real_Count);
        System.out.println("Missing no is " +(real_Count-actual_count));
    }
}
