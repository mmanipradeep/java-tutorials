package com.mani.pradeep.objectcreation;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Employee implements Serializable {
    int empid;
    String empname;
    public Employee(int empid, String empname)
    {
        this.empid = empid;
        this.empname = empname;
    }


}
