public class PerfectSquare {
    public static int perfectSquareNum(int sum){
        int x= ((int)Math.sqrt(sum));
       if(x*x==sum){
           return 1;
       }else return 0;
    }
}
