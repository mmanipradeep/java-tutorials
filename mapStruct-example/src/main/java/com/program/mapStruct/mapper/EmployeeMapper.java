package com.program.mapStruct.mapper;

import com.program.mapStruct.dto.EmployeeDTO;
import com.program.mapStruct.entity.Employee;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface EmployeeMapper {
    List<EmployeeDTO> map(List<Employee> employees);
    Set<EmployeeDTO> map(Set<Employee> employees);
    Map<String, EmployeeDTO> map(Map<String, Employee> idEmployeeMap);
}
