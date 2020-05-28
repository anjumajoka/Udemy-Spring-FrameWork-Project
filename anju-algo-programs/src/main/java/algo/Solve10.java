package algo;

public class Solve10 {
    public static int[] solve10(){
        int x=0;
        int rightNum=0;
        int firstNum =0;
        int secondNum= 0;
        int array[]={firstNum, secondNum};
        int tenFactorial = Factorial.factorial(10);
        System.out.println("10! is " +tenFactorial);
        for (int i=0; i<=10; i++){
            int xFactorial = Factorial.factorial(i);
            for (int j=0; j<=10; j++){
                int yFactorial = Factorial.factorial(j);
                int sum = yFactorial + xFactorial;
                if(sum > tenFactorial){
                    break;
                }
                System.out.println("X ="+"i="+i+" " +xFactorial + " Y ="+"j"+j+"="+  yFactorial + " Sum =" +sum);
                if(sum==tenFactorial){
                  firstNum=i;
                   secondNum=j;
                    System.out.println("the solve10 is " +yFactorial);
                }
            }
        }
        return array;
    }
}
