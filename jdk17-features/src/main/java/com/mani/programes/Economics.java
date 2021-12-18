package com.mani.programes;

public abstract sealed class Economics permits Elasticity {

    protected String programName;

    public Economics(String programName){
        this.programName=programName;
    }

    public abstract String displayProgramName();
}
