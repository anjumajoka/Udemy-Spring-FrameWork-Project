package anju.src;

public class InertialArray {
    public static int inertial(int[] a) {
        int i;
        int j;
        boolean isOneOddNumPresent = false;
        boolean isLargestNumEven = false;
        boolean oddNumGreaterThenEven = false;

        for (i=0; i<a.length; i++){
            if(a[i]%2==1){
                isOneOddNumPresent = true;
            }
        }

        int largestnum = ArrayLargest.sorting(a);
        if(largestnum%2==0){
            isLargestNumEven = true;
        } else return 0;

        int k;
        int oddNum = 0;
        for(j=0; j<a.length; j++){
            if(a[j]%2==0){
                continue;
            }
            oddNum = a[j];
//            System.out.println("anju.src.Comparing oddNum" +oddNum);
            for (k = 0; k<a.length; k++){
                if(a[k]%2==0 && a[k]!=largestnum){
//                    oddNumGreaterThenEven = true;
                    if (oddNum>a[k]){
                         oddNumGreaterThenEven = true;
                    } else return 0;
                }
            }

        }
        if(isOneOddNumPresent && isLargestNumEven && oddNumGreaterThenEven){
            return 1;
        } else return 0;
    }
}
