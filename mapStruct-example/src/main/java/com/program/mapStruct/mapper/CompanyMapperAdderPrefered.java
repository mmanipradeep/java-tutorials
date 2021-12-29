package com.program.mapStruct.mapper;

import com.program.mapStruct.dto.CompanyDTO;
import com.program.mapStruct.entity.Company;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;

@Mapper(collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED,
        uses = EmployeeMapper.class)
public interface CompanyMapperAdderPrefered {
    CompanyDTO map(Company company);
}

