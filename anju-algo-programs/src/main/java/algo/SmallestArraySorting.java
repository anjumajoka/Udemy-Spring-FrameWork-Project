package algo;

public class SmallestArraySorting {
    public static int sorting(int[] x){
        int i;
        int num1;
        int num = x[0];
        int smallest;
        for(i=1; i<x.length; i++){
            smallest= x[i];
            if(num<smallest){
//                do nothing
            } else {
                num=smallest;
            }
        }
        return num;
    }
}
