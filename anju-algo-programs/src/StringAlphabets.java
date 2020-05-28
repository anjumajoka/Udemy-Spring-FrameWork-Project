public class StringAlphabets {

    public static void stringAlphabets(String A, String B){
        String A1 = new String(A);
        String B1 = new String(B);

        int sizeOfA = A1.length();
        int sizeOfB = B1.length();
        int sum = sizeOfA+sizeOfB;
        System.out.println(sum);


        if(A1.compareTo(B1)<0){
            System.out.println("No");
        } else if(A1.compareTo(B1)>0){
            System.out.println("Yes");
        }

        String firstOfA = ""+A1.charAt(0);
        String uperOfA = ""+firstOfA.toUpperCase();
        String firstOfB = ""+B1.charAt(0);
        String uperOfB = ""+firstOfB.toUpperCase();
        System.out.println(uperOfA+A1.substring(1) + " " + uperOfB+B1.substring(1));
    }

}
