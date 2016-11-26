package com.kharchenko.departments;

import java.util.LinkedList;
import java.util.List;

public class Prorectorat extends Department {

    private Department highDepartment;
    private List<Faculty> faculties = new LinkedList<>();

    public Prorectorat(String name) {
        super(name);
    }

    public void addFaculty(Faculty faculty, Prorectorat prorectorat) {
        faculties.add(faculty);
        faculty.setHighDepartment(prorectorat);
    }

    void setHighDepartment(Department department) {
        highDepartment = department;
    }

    public Department getHighDepartment() {
        System.out.println(highDepartment.getName());
        return highDepartment;
    }

    @Override
    public void printStructure() {
        for (Faculty faculty : faculties) {
            System.out.print(faculty.getName() + " ");
        }
        System.out.println();
        faculties.get(0).printStructure();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String toString() {
        return getName() + faculties.toString() + "\n";
    }
}
