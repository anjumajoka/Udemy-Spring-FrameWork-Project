package anju;

import java.util.*;

public class Main {
    public static void main(String args[]) {

        ArrayList<Employee> employee = new ArrayList<>();
        employee.add(new Employee(3, 28, "Anju"));
        employee.add(new Employee(2,33,"isha"));
        employee.add(new Employee(5,32,"disha"));
        employee.add(new Employee(8,30,"gita"));

//        Collections.sort(employee);

        Comparator<Employee> idCompartor2 = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getId() - o2.getId();
            }
        };

        Comparator<Employee> idCompartor3 = (o1, o2) -> o1.getId() - o2.getId();
        Comparator<Employee> idCompartor4 =  Comparator.comparing(Employee::getId).thenComparing(Employee::getName);



        Collections.sort(employee, idCompartor2);
        Collections.sort(employee, idCompartor3);
        Collections.sort(employee, idCompartor4);
        Collections.sort(employee, new IdComparator());
//        System.out.println(employee);

//        Collections.sort(employee, new NameComparator());
//        System.out.println(employee);
//
//

        String[] s = {"a", "d", "c", "b"};
        Arrays.sort(s, new MyComarator());
//        Arrays.asList(s);
        System.out.println(Arrays.asList(s));
    }
}
