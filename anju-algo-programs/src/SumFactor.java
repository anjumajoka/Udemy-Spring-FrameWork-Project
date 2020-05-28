package anju.src;

public class SumFactor {
    public static int sumFactor(int[] a){
        int sum=0;
        int count =0;
        for (int i=0; i<a.length; i++){
            sum= sum + a[i];
        }
        for(int j=0; j<a.length; j++){
           if(a[j]==sum){
               count++;
           }
        }
        return count;
    }
}
