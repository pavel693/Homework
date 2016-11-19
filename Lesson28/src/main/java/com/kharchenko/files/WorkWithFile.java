package com.kharchenko.files;

import java.io.*;
import java.util.ArrayList;

public class WorkWithFile {

    public void writeStudentIntoFile(String lastName, String firstName, int age) throws IOException {
        String path = "F:\\students.txt";

        FileWriter writer = new FileWriter(path, true);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);

        printWriter.println(lastName);
        printWriter.println(firstName);
        printWriter.println(age);
        printWriter.println();
        printWriter.close();
    }

    public ArrayList<Student> readStudentsFromFile() throws IOException {
        String path = "F:\\students.txt";

        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        Student student;
        String line;
        String lastName = "";
        String firstName = "";
        int age = 0;
        int i = 0;

        ArrayList<Student> students = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            i++;
            switch (i) {
                case 1:
                    lastName = line;
                    break;
                case 2:
                    firstName = line;
                    break;
                case 3:
                    age = Integer.parseInt(line);
                    student = new Student(lastName, firstName, age);
                    students.add(student);
                    break;
                case 4:
                    i = 0;
                    break;
            }
        }
        bufferedReader.close();
        return students;
    }

    public void writeStudentsXmlFormat(ArrayList<Student> students) throws IOException {
        String path = "F:\\students_out.txt";

        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);

        printWriter.println("<students>");
        for (Student student : students) {
            printWriter.println("   <student>");
            printWriter.println("       <lastname>" + student.getLastName() + "</lastname>");
            printWriter.println("       <firstname>" + student.getFirstName() + "</firstname>");
            printWriter.println("       <age>" + student.getAge() + "</age>");
            printWriter.println("   </student>");
        }
        printWriter.println("</students>");
        printWriter.close();
    }
}
