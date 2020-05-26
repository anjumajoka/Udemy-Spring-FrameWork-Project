public class Accending {
    public static int[] accendingOrder(int[] x) {
        int i=0;
        int j=0;
        int temp1 ;
        int temp2 ;
        for (j=0; j<=x.length; j++) {
            temp1 =0;
            temp2 =0;
            for (i = 0; i <=x.length-2; i++) {
                temp1 = x[i];
                temp2 = x[i + 1];
                if (temp1 < x[i + 1]) {
//                do nothing
                } else {
                    x[i + 1] = temp1;
                    x[i] = temp2;
                }
            }
        }
        return x;
    }
}
