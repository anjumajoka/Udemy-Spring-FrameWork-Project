package anju.src;

public class ArrayLargest {
    public static int sorting(int[] x){
        int i;
        int largestNum = 0;
        for (i=0; i<x.length; i++){

           if(largestNum>x[i]){
              // Do Nothing
           }else {
               largestNum = x[i];
           }
        }
        return largestNum;
    }
}
