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

        prorectorat1.addProrectorates(faculty1, prorectorat1);
        prorectorat1.addProrectorates(faculty2, prorectorat1);
        prorectorat1.addProrectorates(faculty3, prorectorat1);

        prorectorat2.addProrectorates(faculty1, prorectorat2);
        prorectorat2.addProrectorates(faculty2, prorectorat2);
        prorectorat2.addProrectorates(faculty3, prorectorat2);

        prorectorat3.addProrectorates(faculty1, prorectorat3);
        prorectorat3.addProrectorates(faculty2, prorectorat3);
        prorectorat3.addProrectorates(faculty3, prorectorat3);

        faculty1.addProrectorates(cathedra1, faculty1);
        faculty1.addProrectorates(cathedra2, faculty1);
        faculty1.addProrectorates(cathedra3, faculty1);

        faculty2.addProrectorates(cathedra1, faculty2);
        faculty2.addProrectorates(cathedra2, faculty2);
        faculty2.addProrectorates(cathedra3, faculty2);

        faculty3.addProrectorates(cathedra1, faculty3);
        faculty3.addProrectorates(cathedra2, faculty3);
        faculty3.addProrectorates(cathedra3, faculty3);

        System.out.println(department.print());
        System.out.println(prorectorat1.print());
        System.out.println(prorectorat1.toString());
        System.out.println(faculty1.toString());
        System.out.println(cathedra1.toString());
    }
}
