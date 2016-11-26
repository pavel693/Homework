package com.kharchenko.departments;

public class Cathedra extends Faculty {

    private Faculty highDepartment;

    public Cathedra(String name) {
        super(name);
    }

    @Override
    void setHighDepartment(Department faculty) {
        highDepartment = (Faculty) faculty;
    }

    @Override
    public Faculty getHighDepartment() {
        System.out.println(highDepartment.getName());
        return highDepartment;
    }

    @Override
    public String toString() {
        return super.getName();
    }
}
