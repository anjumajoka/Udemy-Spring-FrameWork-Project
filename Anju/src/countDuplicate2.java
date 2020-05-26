import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class countDuplicate2 {
    public static int numOfDuplicate(String text){
        Map<String, Integer> element = new HashMap<>();
        int x;
        for(x=0; x<text.length(); x++) {
          String firstElement= ""+text.charAt(x);
         boolean elementPresentOrNot= element.containsKey(firstElement);
         if(elementPresentOrNot == false){
             element.put(firstElement, 1);
         } else {
           int newElement  = element.get(firstElement);
           element.put(firstElement, newElement+1);
         }
        }
        System.out.println("the number of element is " +element);
        Set<Map.Entry<String, Integer>> entries = element.entrySet();
        int count = 0;
        for(Map.Entry<String, Integer> entry : entries){
            if (entry.getValue()>1){
                count++;
            }
        }
        return count;
    }
}
