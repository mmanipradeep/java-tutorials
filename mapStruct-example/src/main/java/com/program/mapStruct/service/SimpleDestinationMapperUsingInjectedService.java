package com.program.mapStruct.service;

import com.program.mapStruct.entity.SimpleDestination;
import com.program.mapStruct.entity.SimpleSource;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring")
public abstract class SimpleDestinationMapperUsingInjectedService {
    /**
     * Sometimes, we'll need to utilize other Spring components inside our mapping logic.
     * In this case, we have to use an abstract class instead of an interface:
     */
    @Autowired
    protected SimpleService simpleService;

    @Mapping(target = "name", expression = "java(simpleService.enrichName(source.getName()))")
    public abstract SimpleDestination sourceToDestination(SimpleSource source);
}
