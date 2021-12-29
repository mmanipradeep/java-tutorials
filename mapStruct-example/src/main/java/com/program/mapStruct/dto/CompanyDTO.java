package com.program.mapStruct.dto;

import java.util.*;

public class CompanyDTO {
    private List<EmployeeDTO> employees;

    public List<EmployeeDTO> getEmployees() {
        return employees;
    }

    public void setEmployees(List<EmployeeDTO> employees) {
        this.employees = employees;
    }

    public void addEmployee(EmployeeDTO employeeDTO) {
        if (employees == null) {
            employees = new ArrayList<>();
        }

        employees.add(employeeDTO);
    }
}
