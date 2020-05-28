package algo;

public class sorting2 {
    public static int sort(int[] x) {
        int i;
        int num =0;
        int num2;
        for (i = 0; i < x.length; i++) {
            num2=x[i];
           if(num>num2){
//               do nothing
           } else {
               num = num2;
           }
        }
        return num;
    }
}
