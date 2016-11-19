package com.kharchenko.files;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        WorkWithFile workWithFile = new WorkWithFile();

        try {
            workWithFile.writeStudentIntoFile("Shevchenko", "Andrey", 26);
            workWithFile.writeStudentIntoFile("Petrenko", "Ivan", 30);
            workWithFile.writeStudentIntoFile("Sidorov", "Igor", 25);
            workWithFile.writeStudentIntoFile("Antonov", "Anton", 29);
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<Student> students;

        try {
            students = workWithFile.readStudentsFromFile();
            for (Student student : students) {
                System.out.println(student.getLastName() + " " + student.getFirstName() + " " + student.getAge());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            workWithFile.writeStudentsXmlFormat(workWithFile.readStudentsFromFile());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
