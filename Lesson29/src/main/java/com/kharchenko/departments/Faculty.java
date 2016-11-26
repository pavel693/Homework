package com.kharchenko.departments;

import java.util.ArrayList;
import java.util.List;

public class Faculty extends Prorectorat {

    private Prorectorat highDepartment;
    private List<Cathedra> cathedras = new ArrayList();

    public Faculty(String name) {
        super(name);
    }

    public void addCathedra(Cathedra cathedra, Faculty faculty) {
        cathedras.add(cathedra);
        cathedra.setHighDepartment(faculty);
    }

    @Override
    void setHighDepartment(Department prorectorat) {
        highDepartment = (Prorectorat) prorectorat;
    }

    @Override
    public Prorectorat getHighDepartment() {
        System.out.println(highDepartment.getName());
        return highDepartment;
    }

    @Override
    public void printStructure() {
        for (Cathedra cathedra : cathedras) {
            System.out.print(cathedra.getName() + " ");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return super.getName() + cathedras.toString();
    }
}
