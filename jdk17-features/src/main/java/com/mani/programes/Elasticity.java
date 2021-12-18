package com.mani.programes;

public final class Elasticity extends Economics{

    public Elasticity(String programName) {
        super(programName);
    }


    @Override
    public String displayProgramName() {
        System.out.println(this.programName + " Program ");
        return "";
    }
}
