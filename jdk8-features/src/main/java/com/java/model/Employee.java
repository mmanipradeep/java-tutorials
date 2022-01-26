package com.java.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Employee {

    private String name ;
    private Integer salary;
    private LocalDate joiningDate;


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", joiningDate=" + joiningDate +
                ", department='" + department + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    private String department;
    private String gender;

    public Employee(String name, Integer salary, LocalDate joiningDate, String department, String gender) {
        this.name = name;
        this.salary = salary;
        this.joiningDate = joiningDate;
        this.department = department;
        this.gender = gender;
    }

    public static java.util.List<Employee> getEmployee() {
        List<Employee> employees = new ArrayList<>();

        List<Employee> allEmployees = Arrays.asList(new Employee("Mani",10000, LocalDate.of(2021, 5, 20),"IT","Male"),
                new Employee("Pradeep ", 20000, LocalDate.of(2021, 5, 20),"IT","Female"),
                new Employee("Kumar", 3000,LocalDate.of(20021, 5, 20), "CSE","Female"),
                new Employee("Krishna", 5000, LocalDate.of(2010, 5, 20),"CSE","Male"));

        return employees;
    }


}
