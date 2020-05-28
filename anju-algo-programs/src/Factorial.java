package anju.src;

public class Factorial {
//    public static int factorial(int a){
//        int output =a;
//        do{
//            output=output*(a-1);
//            a = a-1;
//        } while (a>1);
//        return output ;
//    }
    public static int factorial(int a){
        if(a==0){
            return 1;
        }
        int x=a-1;
        for (int i=x; i>=1; i-- ){
            x=a*i;
            a=x;
        }
        return a;
    }
}

