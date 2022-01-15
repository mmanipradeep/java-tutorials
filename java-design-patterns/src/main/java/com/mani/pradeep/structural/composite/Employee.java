package com.mani.pradeep.structural.composite;

import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import javax.naming.OperationNotSupportedException;

@Setter
public class Employee {



    protected  String name;
    protected List<Employee> reportees;
    public void printName(){
        System.out.println("Employee Name is:"+ name);
    }
    public void addReportee(Employee emp) throws OperationNotSupportedException{
        if(reportees==null){
            reportees=new ArrayList<Employee>();
        }
        reportees.add(emp);
    }
    public void removeReportee(Employee emp)throws OperationNotSupportedException{
        reportees.remove(emp);
    }
    public List<Employee> getReportees()throws OperationNotSupportedException{
        return this.reportees;
    }
    //getter & setter for variable 'name'
}
