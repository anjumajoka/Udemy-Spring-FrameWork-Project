package anju;

import java.util.Comparator;

public class MyComarator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return o2.toString().compareTo(o1.toString());
    }
}
