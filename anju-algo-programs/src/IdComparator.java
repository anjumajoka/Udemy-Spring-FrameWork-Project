package anju.src;

import anju.Employee;

import java.util.Comparator;

class IdComparator implements Comparator<anju.Employee> {

    @Override
    public int compare(anju.Employee o1, anju.Employee o2) {
        return o1.getId()-o2.getId();
    }
}
