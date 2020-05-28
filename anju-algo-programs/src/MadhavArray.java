package anju.src;

import java.util.ArrayList;

public class MadhavArray {
    public static int aMadhavArray(int[] a) {
        int n = 0;
        int start = 1;
        int end = 2;
        int firstElement = a[0];
        int temp =0;
        for (int i = 1; i < a.length; i++) {
            int sum = 0;
            for (int j = start; j <=end; j++) {
                sum = sum + a[j];
                temp = j;
            }
            if (sum != firstElement) {
                return 0;
            }
            start = temp + 1;
            end = start + i + 1;
            if(end > a.length) break;
        }
        return 1;
    }

}
