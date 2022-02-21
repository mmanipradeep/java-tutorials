package com.java;

public class DepartmentValidation {//implements IValidation

//    public Department department;
//    DepartmentValidation(Department department, IValidation subValidationCriteria){
//        this.department = department;
//        super(subValidationCriteria);
//    }
//    @Override
//    public boolean validate(Employee emp, boolean isAndSubcriteria) {
//        boolean baseValidation = (emp.department == this.department)
//
//        if(isAndSubcriteria){
//            return baseValidation &&   subValidationCriteria.validate(emp);
//        }
//        return baseValidation || subValidationCriteria.validate(emp);
//    }
//
//    public Department department;
//    DepartmentValidation(Department department, IValidation subValidationCriteria){
//        this.department = department;
//        super(subValidationCriteria);
//    }
//
//
//
//    @Override
//    public boolean validate(Employee emp) {
//        return (emp.department == this.department)
//                && subValidationCriteria.validate(emp);
//    }
//
//    public class ExperienceValidation implements IValidation {
//        public int minExp;
//        public int maxExp;
//
//        ExperienceValidation(int minExp, int maxExp, IValidation subValidationCriteria) {
//            this.minExp = minExp;
//            this.maxExp = maxExp;
//            super(subValidationCriteria);
//        }
//
//        public boolean validate(Employee emp) {
//            return (emp.yearsOfExperience >= minExp && emp.yearsOfExperience < maxExp)
//                    && subValidationCriteria.validate(emp);
//        }
//    }
//
//    public class QualificationValidation implements IValidation {
//        public Degree qualification;
//        public IValidation subValidationCriteria;
//
//        QualificationValidation(Degree qualification, IValidation subValidationCriteria) {
//            this.qualification = qualification;
//            this.subValidationCriteria = subValidationCriteria;
//        }
//
//        public boolean validate(Employee emp) {
//            return  (emp.qualification == this.qualification)
//                    && subValidationCriteria.validate(emp);
//        }
//    }

}
