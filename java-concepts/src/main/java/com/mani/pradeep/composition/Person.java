package com.mani.pradeep.composition;

public class Person {
    //composition has-a relationship
    private Job job;

    public Person(){
        this.job=new Job();
        job.setSalary(1000L);
    }
    public long getSalary() {
        return job.getSalary();
    }

    //Java composition is achieved by using instance variables that refers to other objects.
   // For example, a Person has a Job. Let’s see this with a java composition example code.
}
