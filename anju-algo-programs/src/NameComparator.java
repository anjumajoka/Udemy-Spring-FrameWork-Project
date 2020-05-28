package anju.src;

import anju.Employee;

import java.util.Comparator;

public class NameComparator implements Comparator<anju.Employee> {


    @Override
    public int compare(anju.Employee o1, anju.Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
