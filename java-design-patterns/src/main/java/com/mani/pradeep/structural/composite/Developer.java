package com.mani.pradeep.structural.composite;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import javax.naming.OperationNotSupportedException;
@Setter
public class Developer extends Employee {

    public void addReportee(Employee emp)throws OperationNotSupportedException{
        throw new OperationNotSupportedException();
    }
    public void removeReportee(Employee emp)throws OperationNotSupportedException{
        throw new OperationNotSupportedException();
    }
    public List<Employee> getReportees()throws OperationNotSupportedException{
        throw new OperationNotSupportedException();
    }
}
