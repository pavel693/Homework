package com.kharchenko.departments;

public class Main {

    public static void main(String[] args) {
        Department department = new Department("Department");

        Prorectorat prorectorat1 = new Prorectorat("A Prorectorat");
        Prorectorat prorectorat2 = new Prorectorat("B Prorectorat");
        Prorectorat prorectorat3 = new Prorectorat("C Prorectorat");

        Faculty faculty1 = new Faculty("First Faculty");
        Faculty faculty2 = new Faculty("Second Faculty");
        Faculty faculty3 = new Faculty("Third Faculty");

        Cathedra cathedra1 = new Cathedra("Cathedra 1");
        Cathedra cathedra2 = new Cathedra("Cathedra 2");
        Cathedra cathedra3 = new Cathedra("Cathedra 3");

        department.addProrectorates(prorectorat1, department);
        department.addProrectorates(prorectorat2, department);
        department.addProrectorates(prorectorat3, department);

        prorectorat1.addFaculty(faculty1, prorectorat1);
        prorectorat1.addFaculty(faculty2, prorectorat1);
        prorectorat1.addFaculty(faculty3, prorectorat1);

        prorectorat2.addFaculty(faculty1, prorectorat2);
        prorectorat2.addFaculty(faculty2, prorectorat2);
        prorectorat2.addFaculty(faculty3, prorectorat2);

        prorectorat3.addFaculty(faculty1, prorectorat3);
        prorectorat3.addFaculty(faculty2, prorectorat3);
        prorectorat3.addFaculty(faculty3, prorectorat3);

        faculty1.addCathedra(cathedra1, faculty1);
        faculty1.addCathedra(cathedra2, faculty1);
        faculty1.addCathedra(cathedra3, faculty1);

        faculty2.addCathedra(cathedra1, faculty2);
        faculty2.addCathedra(cathedra2, faculty2);
        faculty2.addCathedra(cathedra3, faculty2);

        faculty3.addCathedra(cathedra1, faculty3);
        faculty3.addCathedra(cathedra2, faculty3);
        faculty3.addCathedra(cathedra3, faculty3);

        System.out.println(department.toString());
        System.out.println(faculty1.toString());
        cathedra3.getHighDepartment().getHighDepartment().getHighDepartment();
    }
}
