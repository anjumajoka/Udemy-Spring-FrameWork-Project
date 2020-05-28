package algo;

import java.util.TreeSet;

public class CompComp {
    public static void emplyoee(){
        Employee e1= new Employee("Anju", 3);
        Employee e2= new Employee("Anshul", 5);
        Employee e3= new Employee("Radha", 9);
        Employee e4= new Employee("Pooja", 4);
        Employee e5= new Employee("Nisha", 6);

        TreeSet t = new TreeSet();
        t.add(e1);
        t.add(e2);
        t.add(e3);
        t.add(e4);
        t.add(e5);
        System.out.println(t);

    }
}
