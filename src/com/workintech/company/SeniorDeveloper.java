package com.workintech.company;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(long id, String name) {
        super(id, name);
    }
    @Override
    public void work(){
        setSalary(45000);
        System.out.println(getName() +" senior starts the working");
    }
}
