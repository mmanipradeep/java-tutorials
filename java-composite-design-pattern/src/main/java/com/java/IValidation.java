package com.java;

public abstract class IValidation {

    public Designation designation;
    public IValidation subValidationCriteria;
    IValidation(IValidation subValidationCriteria){
        this.subValidationCriteria = subValidationCriteria;
    }
    public abstract boolean validate(Employee emp);
}
