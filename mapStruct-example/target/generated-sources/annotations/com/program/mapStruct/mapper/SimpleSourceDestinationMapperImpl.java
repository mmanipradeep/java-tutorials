package com.program.mapStruct.mapper;

import com.program.mapStruct.entity.SimpleDestination;
import com.program.mapStruct.entity.SimpleSource;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-12-27T14:45:58+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17 (Oracle Corporation)"
)
public class SimpleSourceDestinationMapperImpl implements SimpleSourceDestinationMapper {

    @Override
    public SimpleDestination sourceToDestination(SimpleSource source) {
        if ( source == null ) {
            return null;
        }

        SimpleDestination simpleDestination = new SimpleDestination();

        simpleDestination.setName( source.getName() );
        simpleDestination.setDescription( source.getDescription() );

        return simpleDestination;
    }

    @Override
    public SimpleSource destinationToSource(SimpleDestination destination) {
        if ( destination == null ) {
            return null;
        }

        SimpleSource simpleSource = new SimpleSource();

        simpleSource.setName( destination.getName() );
        simpleSource.setDescription( destination.getDescription() );

        return simpleSource;
    }
}
