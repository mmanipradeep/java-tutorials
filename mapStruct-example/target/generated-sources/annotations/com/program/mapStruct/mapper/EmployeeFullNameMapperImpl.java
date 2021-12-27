package com.program.mapStruct.mapper;

import com.program.mapStruct.dto.EmployeeFullNameDTO;
import com.program.mapStruct.entity.Employee;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-12-27T16:09:23+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17 (Oracle Corporation)"
)
public class EmployeeFullNameMapperImpl implements EmployeeFullNameMapper {

    @Override
    public List<EmployeeFullNameDTO> map(List<Employee> employees) {
        if ( employees == null ) {
            return null;
        }

        List<EmployeeFullNameDTO> list = new ArrayList<EmployeeFullNameDTO>( employees.size() );
        for ( Employee employee : employees ) {
            list.add( map( employee ) );
        }

        return list;
    }
}
