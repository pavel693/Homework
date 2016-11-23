package com.kharchenko.serialization;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        Student student = new Student("Andrew", "Wood", 20);

        System.out.println("Before serialization");
        System.out.println(student);

        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("f:\\student_encryption.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(student);
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        Student student1 = new Student();
        try {
            fileInputStream = new FileInputStream("f:\\student_encryption.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);
            student1 = (Student) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("After deserialization");
        System.out.println(student1);
    }
}
