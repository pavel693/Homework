package com.kharchenko.departments;

public class Cathedra extends Faculty {

    public Cathedra(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return getHighDepartment().getHighDepartment().getHighDepartment().getName()
                + "\n" + super.toString();
    }
}
