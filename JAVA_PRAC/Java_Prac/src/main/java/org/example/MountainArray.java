package org.example;

public class MountainArray {
    public static void main(String[] args) {
        int[] a = {1, 3, 2, 4, 3, 2, 1};
        int max = 0;
        int max_index=0;
        boolean status = true;
        //Calculating the max no in the array
        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] > max) {
                max = a[i];
                max_index=i;
            }
        }
        System.out.println(max_index);
if(a.length-1!=max_index && max_index!=0) {
    for (int j = 0; j < max_index; j++) {
        if (a[j] < a[j + 1]) {
            status = false;
        } else {
            status = true;
            break;
        }
    }
    if (status == false) {
        for (int k = max_index; k < a.length - 1; k++) {
            if (a[k] > a[k + 1]) {
                status = false;
            }
        }
    }
}
      if(status==false){
          System.out.println("Array is Mountain array");
      }
      else{
          System.out.println("Array is not Mountain Array");
      }
        }
    }
