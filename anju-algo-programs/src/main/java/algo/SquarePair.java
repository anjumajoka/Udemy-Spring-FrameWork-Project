package algo;

public class SquarePair {
    public static int countSquarePairs(int[] a) {
        int i = 0;
        int sum = 0;
        int count = 0;
        for (i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                for (int j = i + 1; j < a.length; j++) {
                    sum = a[i] + a[j];
                    int isPerfectSquare = PerfectSquare.perfectSquareNum(sum);
                    if (isPerfectSquare == 1) {
                        count++;
                        System.out.println("The perfect square pair are" + a[i] + "+" + a[j] + "=" + sum);
                    }
                }
            }
        }
        return count;
    }
}
