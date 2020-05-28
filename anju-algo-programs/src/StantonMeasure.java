package anju.src;

public class StantonMeasure {
    public static int stantonMeasure(int[] a){
        int x=a[0];
        int count=0;
        int count1=0;
        int numOfOnes =0;
        int numOfTows =0;
        for (int i=0; i<a.length; i++){
          if(a[i]==1){
              count++;
              numOfOnes =count;
          }
        }
        for (int j=0; j<a.length; j++){
           if(a[j]==numOfOnes){
               count1++;
               numOfTows =count1;
           }
        }
        return numOfTows;
    }
}
