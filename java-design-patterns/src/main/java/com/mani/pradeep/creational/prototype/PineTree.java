package com.mani.pradeep.creational.prototype;

public class PineTree extends Tree{
    private final String type;

    public PineTree(double mass, double height) {
        super(mass, height);
        this.type = "Pine";
    }

    public String getType() {
        return type;
    }

    @Override
    public Tree copy() {
        PineTree pineTreeClone = new PineTree(this.getMass(), this.getHeight());
        pineTreeClone.setPosition(this.getPosition());
        return pineTreeClone;
    }
}
