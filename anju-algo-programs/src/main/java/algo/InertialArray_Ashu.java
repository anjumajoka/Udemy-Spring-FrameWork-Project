package algo;

public class InertialArray_Ashu {
    public static int inertial(int[] a) {
        int i;
        int j;
        boolean isOddNumberPresent = false;
        boolean isLargestNumberEven =false;
        boolean isEveryOddGreaterThanEven =false;

        int largestNumber = ArrayLargest.sorting(a);
        if (largestNumber % 2 == 0) {
            isLargestNumberEven = true;
        } else {
            return 0;
        }

        for (i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) {
                isOddNumberPresent = true;
            }
        }

        int oddNum = 1;
        for (j = 0; j < a.length; j++) {
            if (a[j] % 2 == 1) {
                oddNum = a[j];
                for (int k = 0; k < a.length; k++) {
                    if (a[k] % 2 == 1 || a[k] == largestNumber) {
                        continue;
                    }
                    if (a[k] % 2 == 0 && oddNum < largestNumber && oddNum > a[k]) {
                        isEveryOddGreaterThanEven = true;
                    } else {
                        return 0;
                    }
                }
            }
        }

        if (isOddNumberPresent && isEveryOddGreaterThanEven && isLargestNumberEven) {
            return 1;
        }
        return 0;
    }

}
