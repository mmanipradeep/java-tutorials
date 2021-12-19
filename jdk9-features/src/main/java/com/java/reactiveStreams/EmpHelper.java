package com.java.reactiveStreams;

import java.util.ArrayList;
import java.util.List;

public class EmpHelper {

    public static List<Employee> getEmps() {

        Employee e1 = new Employee(1, "Pankaj");
        Employee e2 = new Employee(2, "David");
        Employee e3 = new Employee(3, "Lisa");
        Employee e4 = new Employee(4, "Ram");
        Employee e5 = new Employee(5, "Anupam");

        List<Employee> emps = new ArrayList<>();
        emps.add(e1);
        emps.add(e2);
        emps.add(e3);
        emps.add(e4);
        emps.add(e5);

        return emps;
    }

    public static List<Freelancer> getFreelancer() {

        Freelancer e1 = new Freelancer(1,101, "Pankaj");
        Freelancer e2 = new Freelancer(2,102, "David");
        Freelancer e3 = new Freelancer(3,103, "Lisa");
//        Freelancer e4 = new Freelancer(4,104, "Ram");
//        Freelancer e5 = new Freelancer(5,105, "Anupam");

        List<Freelancer> freelancer = new ArrayList<>();
        freelancer.add( e1);
        freelancer.add(e2);
        freelancer.add( e3);
//        emps.add( e4);
//        emps.add( e5);

        return freelancer;
    }


}
