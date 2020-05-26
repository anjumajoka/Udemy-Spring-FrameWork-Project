import java.util.ArrayList;

public class Prog2 {
    public void primeCount(int start, int end) {

         ArrayList<Integer> hcf = primeCount1(start, end);
        System.out.println("The number of primes between " +start +" and " +end + " is = " +hcf);
        System.out.println("The number of primes between " + hcf.size());
    }

    public boolean primeNumbr(int x) {
       int y = 2;
       int count = 0;
       while(y<=x) {
           int z = x % y;
           if (z==0){
           count++;
           }
           y++;
       }
       if(count<2){
           return true;
       }
       return false;
    }


    public ArrayList<Integer> primeCount1(int start, int end){
        ArrayList<Integer> listOfPrime = new ArrayList<>();
        if(end < start || end <=0 || start  <0){
            return listOfPrime;
        }
        int count = 0;
        while (start<=end){

            if(primeNumbr(start) == true){
                count++;
                listOfPrime.add(start);
            }
            start++;
        }
        return listOfPrime;
    }

    public int[] primeCountByArray(int start, int end){
        int[] listOfPrime = new int[end-start];
        if(end < start || end <=0 || start  <0){
            return listOfPrime;
        }
        int count = 0;
        while (start<=end){
            if(primeNumbr(start) == true){
                listOfPrime[count] =start;
                count++;
            }
            start++;
        }
        return listOfPrime;
    }

}