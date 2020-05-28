package algo;

public class PorcupineNumber {
    public static int finePorcupineNumber(int num) {
        int itIsPorcupineNum = 0;
        int x;
        int x1 = 0;
        int endNum = 0;
        int endNumNext;
        int y = 0;
        for (x = num + 1; x < x + 1; x++) {
            int isPrimeNum = FindPrimeNumber.primeNumber(x);
            if (isPrimeNum == 1) {
                endNum = x % 10;
                if (endNum == 9) {
                    y=x+1;
                    for (int j = y; j < j + 1; j++) {
                        int nextPrimeNum = FindPrimeNumber.primeNumber(j);
                        if (nextPrimeNum == 1) {
                            endNumNext = j % 10;
                            if (endNumNext == 9) {
                                itIsPorcupineNum = x;
                                return itIsPorcupineNum;
                            }
                            break;
                        }
                    }
                }
            }
        }
        return itIsPorcupineNum;
    }
    }

