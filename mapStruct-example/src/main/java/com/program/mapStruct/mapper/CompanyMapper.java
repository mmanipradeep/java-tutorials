package com.program.mapStruct.mapper;

import com.program.mapStruct.dto.CompanyDTO;
import com.program.mapStruct.entity.Company;
import org.mapstruct.Mapper;

@Mapper(uses = EmployeeMapper.class)
public interface CompanyMapper {
    CompanyDTO map(Company company);
}
