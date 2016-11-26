package com.kharchenko.departments;

import java.util.LinkedList;
import java.util.List;

public class Department {

    private String name;
    private List<Prorectorat> prorectorates = new LinkedList<>();

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addProrectorates(Prorectorat prorectorat, Department department) {
        prorectorates.add(prorectorat);
        prorectorat.setHighDepartment(department);
    }

    @Override
    public String toString() {
        return name + "\n" + prorectorates.toString();
    }
}
