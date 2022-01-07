package com.program.mapStruct.mapper;

import com.program.mapStruct.dto.CompanyDTO;
import com.program.mapStruct.entity.Company;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-07T14:33:41+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17 (Oracle Corporation)"
)
public class CompanyMapperAdderPreferedImpl implements CompanyMapperAdderPrefered {

    @Override
    public CompanyDTO map(Company company) {
        if ( company == null ) {
            return null;
        }

        CompanyDTO companyDTO = new CompanyDTO();

        return companyDTO;
    }
}
