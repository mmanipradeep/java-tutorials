package com.iluwatar.visitor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Slf4j
public class CommanderVisitor implements UnitVisitor{
    private static Logger LOGGER = LoggerFactory.getLogger(CommanderVisitor.class);
    @Override
    public void visitSoldier(Soldier soldier) {
        // Do nothing
    }

    @Override
    public void visitSergeant(Sergeant sergeant) {
        // Do nothing
    }

    @Override
    public void visitCommander(Commander commander) {
        LOGGER.info("Good to see you {}", commander);
    }
}
