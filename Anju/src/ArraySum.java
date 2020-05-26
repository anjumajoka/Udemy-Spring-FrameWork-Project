public class ArraySum {
    public static int sumOfArray(int[] a) {
        int i;
        int j;
        int sum = 0;
        for(i=0; i<a.length; i++){
            sum = sum + a[i];
        }
        return sum;
    }

}
