package anju.src;

public class FindPrimeNumber {
    public static int primeNumber(int x){
        int i = 1;
        int result =0;
        int count =0;
        int mod =0;
        for(i=1; i<x; i++) {
            mod = x % i;
            if (mod == 0) {
                count++;
                if (count < 2) {
                    result = 1;
                }
                else return 0;
            }
        }
            return result;
        }
}
