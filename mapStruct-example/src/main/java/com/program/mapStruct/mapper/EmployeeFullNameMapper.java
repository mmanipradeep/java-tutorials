package com.program.mapStruct.mapper;

import com.program.mapStruct.dto.EmployeeFullNameDTO;
import com.program.mapStruct.entity.Employee;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface EmployeeFullNameMapper {
    List<EmployeeFullNameDTO> map(List<Employee> employees);

    default EmployeeFullNameDTO map(Employee employee) {
        EmployeeFullNameDTO employeeInfoDTO = new EmployeeFullNameDTO();
        employeeInfoDTO.setFullName(employee.getFirstName() + " " + employee.getLastName());

        return employeeInfoDTO;
    }
}
