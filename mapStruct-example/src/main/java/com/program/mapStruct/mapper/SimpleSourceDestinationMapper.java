package com.program.mapStruct.mapper;

import com.program.mapStruct.entity.SimpleDestination;
import com.program.mapStruct.entity.SimpleSource;
import org.mapstruct.Mapper;

@Mapper
public interface SimpleSourceDestinationMapper {
    SimpleDestination sourceToDestination(SimpleSource source);
    SimpleSource destinationToSource(SimpleDestination destination);
}
