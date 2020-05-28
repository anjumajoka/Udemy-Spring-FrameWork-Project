package algo;

public class GuthrieSequence {
    public static int isGuthrieSequence(int[] a){
        int i;
        int n =a[0];
        for (i=0; i<a.length; i++) {
            do {
                if (n % 2 == 0 && n==a[i]) {
                    int x = n / 2;
                    n = x;
                } else if(n==a[i]) {
                    int y = n * 3;
                    int num = y + 1;
                    n = num;
                }
                if(n==1){
                    return 1;
                }
            }while (n==1);
        }
        if(n==1){
            return 1;
        }
        return 0;
    }
}
