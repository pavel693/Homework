package com.kharchenko.departments;

public class Faculty extends Prorectorat {

    public Faculty(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return getHighDepartment().getHighDepartment().getName() +
                "\n" + super.toString();
    }
}
