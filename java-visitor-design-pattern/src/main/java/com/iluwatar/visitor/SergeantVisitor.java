package com.iluwatar.visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SergeantVisitor     implements  UnitVisitor{

    private static Logger LOGGER = LoggerFactory.getLogger(SergeantVisitor.class);
    @Override
    public void visitSoldier(Soldier soldier) {
        // Do nothing
    }

    @Override
    public void visitSergeant(Sergeant sergeant) {
        LOGGER.info("Hello {}", sergeant);
    }

    @Override
    public void visitCommander(Commander commander) {
        // Do nothing
    }
}
