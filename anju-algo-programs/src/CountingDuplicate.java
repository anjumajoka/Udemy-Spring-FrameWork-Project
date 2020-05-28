package anju.src;

import java.util.*;

public class CountingDuplicate {
    public static int countDuplicate(String text){
        Map<String, Integer> charMap = new HashMap<>();
        int x;
        for (x=0 ; x<text.length() ; x++){
           char firstChar = text.charAt(x);
           boolean charPresentOrNot = charMap.containsKey(firstChar);
           if(charPresentOrNot == false){
               charMap.put(firstChar+"".toLowerCase(), 1);
           } else {
               int alreadyPresent = charMap.get(firstChar);
               charMap.put(firstChar+"".toLowerCase(), alreadyPresent+1);
           }
        }
        System.out.println("the out put " +charMap);
        int count = 0;
        Set<Map.Entry<String,Integer>> entrties = charMap.entrySet();

        for(Map.Entry<String,Integer> entry : entrties){ // for each loop
            if(entry.getValue() > 1){
                count++;
            }
        }

        int countingSetEntry=0;
        Set<String> setOfString = new HashSet<>();
        setOfString.add("A".toLowerCase());
        setOfString.add("a");

        for (String singleElement : setOfString){
            System.out.println("ChasrSet is " +singleElement);
            countingSetEntry++;
        }
        System.out.println("countingSetEntry = "+ countingSetEntry);

        setOfString.forEach((singleElement2) -> {
            System.out.println(singleElement2);
        });


        return count;

    }
}
