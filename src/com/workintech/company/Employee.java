package com.workintech.company;

public class Employee {
    private long id;
    private String name;
    private double salary;
    public Employee(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee(long id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary < 0 ? 0 : salary;
    }

    public void work(){
        System.out.println("Employee starts to working");
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("id: "+getId());
        stringBuilder.append(" name: "+getName());
        return stringBuilder.toString();
    }
}
