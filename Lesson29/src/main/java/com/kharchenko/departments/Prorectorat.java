package com.kharchenko.departments;

public class Prorectorat extends Department {

    public Prorectorat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return getHighDepartment().getName() + "\n" + print();
    }
}
