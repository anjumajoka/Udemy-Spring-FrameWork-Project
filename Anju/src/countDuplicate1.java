import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class countDuplicate1 {
    public static int countDuplicate(String text){
        Map<String,Integer> numberOfElements = new HashMap<>();
        int x;
        for(x=0; x<text.length(); x++){
           String firstElement = ""+text.charAt(x);
           boolean firstElementIsPresentOrNot =  numberOfElements.containsKey(firstElement);
           if(firstElementIsPresentOrNot == false) {
               numberOfElements.put(firstElement, 1);
           } else {
               int present = numberOfElements.get(firstElement);
               numberOfElements.put(firstElement, present + 1);
           }
        }
        System.out.println("the number of count is " +numberOfElements);
        Set<Map.Entry<String, Integer>> entries = numberOfElements.entrySet();
        int count = 0;
        for(Map.Entry<String, Integer> entry : entries){
            if(entry.getValue()>1){
                count++;
            }
        }
        return count;
    }
}
