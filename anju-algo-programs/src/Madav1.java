package anju.src;

public class Madav1 {
    public static int amadhavArray(int[] a) {
        int i;
        int start = 1;
        int end = 2;
        int x;
        int sum;
        int temp =1;
        int firstElement = a[0];

        for (i = 0; i < a.length; i++) {
            sum = 0;
            temp++;
            for (x = start; x <= end; x++) {
                sum = sum+ a[x];
            }
            if(sum!=firstElement){
                return 0;
            }
            start= end+1;
            end=start+temp;
            if(end>a.length) break;
        }
        return 1;
    }
}
