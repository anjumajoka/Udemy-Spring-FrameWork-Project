package algo;

public class Prog1 {
    public void isPerfectSquare(int x) {
        int y =x;
        if (perfectSquare(x) == true){
         System.out.println(x+ " is a perfect square root");
        }
        else {
            for (y=x;y<1000;y++){
               if (perfectSquare(y)== true){
                   System.out.println(y+ " is a perfect square root");
                   break;
               }
            }
        }
}

    public boolean perfectSquare(int x){
        boolean perfect1;
       int y = ((int)Math.sqrt(x));
       if(y*y == x){
           perfect1 = true;
       }
       else {
           perfect1 = false;
       }
       return  perfect1;

    }

}
