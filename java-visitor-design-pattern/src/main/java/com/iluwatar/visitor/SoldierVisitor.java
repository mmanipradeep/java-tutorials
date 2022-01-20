package com.iluwatar.visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SoldierVisitor implements UnitVisitor{
   private static Logger LOGGER = LoggerFactory.getLogger(SoldierVisitor.class);
    @Override
    public void visitSoldier(Soldier soldier) {
        LOGGER.info("Greetings {}", soldier);
    }

    @Override
    public void visitSergeant(Sergeant sergeant) {
        // Do nothing
    }

    @Override
    public void visitCommander(Commander commander) {
        // Do nothing
    }
}
