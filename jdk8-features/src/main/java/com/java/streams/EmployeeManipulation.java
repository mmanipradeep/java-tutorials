package com.java.streams;

import com.java.model.Employee;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;

public class EmployeeManipulation {


    public static void listOfStringSorting(){

        //natural sorting
        List < String > sortedList = getListofFruits().stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println("Group Name: " );
        sortedList.forEach(System.out::println);

        // reverse sorting
        List<String> strList = getListofFruits().stream().sorted(Comparator.reverseOrder()).collect(toList());
        strList.forEach(System.out::println);

        Map<String, Long> result =
                strList.stream().collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()
                        )
                );


        System.out.println(result);

    }

    public void listOfObjectSorting(){

        List<Employee> naturalSortedEmployee =  Employee.getEmployee().stream()
                .sorted(Comparator.comparingInt(Employee:: getSalary)).collect(Collectors.toList());
        naturalSortedEmployee.forEach(System.out::println);

        List<Employee> reverseSortedEmployee =  Employee.getEmployee().stream()
                .sorted(Comparator.comparingInt(Employee:: getSalary).reversed()).collect(Collectors.toList());
        reverseSortedEmployee.forEach(System.out::println);

    }

    public void groupByFields(){
        //https://javadeveloperzone.com/java-basic/java-8-stream-groupingby-example/
        Map<String,List<Employee>> groupedEmployee =  Employee.getEmployee().stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(groupedEmployee);

        java.util.Map<String, List<String>> employess =  Employee.getEmployee().stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));

        employess.forEach((name, employeeList) -> {
            System.out.println("Group Name: " + name);
            employeeList.forEach(System.out::println);
            System.out.println("---------------------------------------------");
        });
    }


    public static void main(String[] args) {


        listOfStringSorting();
//        Map<String,List<Employee>> groupedEmployee =  Employee.getEmployee().stream().collect(Collectors.groupingBy(Employee::getDepartment));
//        System.out.println(groupedEmployee);
//
//        java.util.Map<String, java.util.List<String>> employess =  Employee.getEmployee().stream()
//                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));
//
//        employess.forEach((name, employeeList) -> {
//            System.out.println("Group Name: " + name);
//            employeeList.forEach(System.out::println);
//            System.out.println("---------------------------------------------");
//        });
//        Map<String,List<Employee>> groupedEmployee =  Employee.getEmployee().stream().collect(Collectors.groupingBy(Employee::getDepartment));
//        System.out.println(groupedEmployee);
//        List < String > fruits = new ArrayList< String >();
//        fruits.add("Banana");
//        fruits.add("Apple");
//        fruits.add("Mango");
//        fruits.add("Orange");

      //  List < String > sortedList = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
     //   System.out.println(sortedList);

     //   List < String > sortedList1 = fruits.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList());


      //  List < String > sortedList2 = fruits.stream().sorted().collect(Collectors.toList());
      //  System.out.println(sortedList2);

        LocalDate bday = LocalDate.of(1955, Month.MAY, 19);
        LocalDate today = LocalDate.now();
        Period age = Period.between(bday, today);
        int years = age.getYears();

       // System.out.println(years);
//
//        List<Employee> allEmployees = Arrays.asList(new Employee("Mani",10000, LocalDate.of(2021, 5, 20),"IT","Male"),
//                new Employee("Pradeep ", 20000, LocalDate.of(2021, 5, 20),"IT","Female"),
//                new Employee("Kumar", 3000,LocalDate.of(20021, 5, 20), "CSE","Female"),
//                new Employee("Krishna", 5000, LocalDate.of(2010, 5, 20),"CSE","Male"));
//

      // System.out.print(period.getYears() + " years,");
       Map<String, Employee> topEmployees =
               Employee.getEmployee().stream()
                       .filter(e-> (Period.between(e.getJoiningDate(),LocalDate.now())).getYears()>3)
                       .collect(groupingBy(
                               e -> e.getDepartment(),
                               collectingAndThen(maxBy(comparingInt(e -> e.getSalary())), Optional::get)
                       ));
   //    System.out.println("final Resul.t "+topEmployees);

        Map<String, Map<String, Long>> multipleFieldsMap =  Employee.getEmployee().stream()
                .collect(
                        Collectors.groupingBy(Employee::getDepartment,
                                Collectors.groupingBy(Employee::getGender,
                                        Collectors.counting())));

        Map<String, Long> multipleFieldsMap1 =  Employee.getEmployee().stream()
                .collect(
                        Collectors.groupingBy(Employee::getGender,
                             //   Collectors.groupingBy(Employee::getGender,
                                        Collectors.counting()));

       // System.out.println(multipleFieldsMap1);
    }
    public static List<String> getListofFruits(){
        List < String > fruits = new ArrayList< String >();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");

        return fruits;
    }


}
