package anju.src;

public class GuthrieSequanceInteger {
    public static int isGuthrieSequance(int a) {
        if (a==1||a<1){
            return 0;
        }
        int i;
        int count = 0;
        do {
            if (a % 2 == 0) {
                int x = a / 2;
                a = x;
                count++;
            } else {
                int y = a * 3;
                int num = y + 1;
                a = num;
                count++;
            }
        } while (a>1);
        return count;
    }

}
