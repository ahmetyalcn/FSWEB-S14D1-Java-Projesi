package com.workintech.main;

import com.workintech.company.HRManager;
import com.workintech.company.JuniorDeveloper;
import com.workintech.company.MidDeveloper;
import com.workintech.company.SeniorDeveloper;

import java.util.Arrays;

public class CompanyMain {
    public static void main(String[] args) {
        System.out.println("*********Employee*********");

        JuniorDeveloper junior = new JuniorDeveloper(1,"Ali Mehmet");
        MidDeveloper mid = new MidDeveloper(2,"Emir Can");
        SeniorDeveloper senior = new SeniorDeveloper(3,"Selim Mert");
        HRManager hrmanager = new HRManager(4,"HR Çalışanı", new JuniorDeveloper[2], new MidDeveloper[2], new SeniorDeveloper[2]);


        junior.work();
        System.out.println("junior.name= " + junior.getName() );
        System.out.println("junior.id= " + junior.getId() );
        System.out.println("junior.salary= " + junior.getSalary() );

        mid.work();
        System.out.println("mid.name= " + mid.getName() );
        System.out.println("mid.id= " + mid.getId() );
        System.out.println("mid.salary= " + mid.getSalary() );

        senior.work();
        System.out.println("senior.name= " + senior.getName() );
        System.out.println("senior.id= " + senior.getId() );
        System.out.println("senior.salary= " + senior.getSalary() );

        System.out.println("hr.name= " + hrmanager.getName() );
        System.out.println("hr.id= " + hrmanager.getId() );
        System.out.println("hr.salary= " + hrmanager.getSalary() );

        hrmanager.addEmployee(0,junior);
        hrmanager.addEmployee(0,mid);
        hrmanager.addEmployee(0,senior);

        System.out.println("juniorDevs" + Arrays.toString(hrmanager.getJuniors()));
        System.out.println("midDevs" + Arrays.toString(hrmanager.getMids()));
        System.out.println("seniorDevs" + Arrays.toString(hrmanager.getSeniors()));

    }
}
