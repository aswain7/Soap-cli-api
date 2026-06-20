package org.example;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a={10,40,30,20,80};
        int target=70;
        boolean found=false;
        Arrays.sort(a); // 10 20 30 40 80
        int left=0;
        int right=a.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(target==a[mid]){
                found=true;
                break;
            } else if (target>mid) {
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        if(found){
            System.out.println("No is Present");
        }
        else {
            System.out.println("No is not Present");
        }
    }
}
