package org.examples2;

public class Missing_no_Array {
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5};
        int act_Sum = 0;
        int exp_Sum=0;
        for (int i = 0; i < a.length; i++) {
            act_Sum = act_Sum + a[i];
        }
        int b = a[0];
        int z = a[a.length - 1];
        for (int i = b; i <= z; i++) {
            exp_Sum = exp_Sum + i;
        }
        System.out.println(exp_Sum-act_Sum);
    }
}
