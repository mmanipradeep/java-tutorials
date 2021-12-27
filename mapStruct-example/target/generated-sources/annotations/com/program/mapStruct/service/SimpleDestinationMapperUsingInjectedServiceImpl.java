package com.program.mapStruct.service;

import com.program.mapStruct.entity.SimpleDestination;
import com.program.mapStruct.entity.SimpleSource;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-12-27T14:57:42+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17 (Oracle Corporation)"
)
@Component
public class SimpleDestinationMapperUsingInjectedServiceImpl extends SimpleDestinationMapperUsingInjectedService {

    @Override
    public SimpleDestination sourceToDestination(SimpleSource source) {
        if ( source == null ) {
            return null;
        }

        SimpleDestination simpleDestination = new SimpleDestination();

        simpleDestination.setDescription( source.getDescription() );

        simpleDestination.setName( simpleService.enrichName(source.getName()) );

        return simpleDestination;
    }
}
