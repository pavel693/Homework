package com.kharchenko.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Student implements Externalizable {
    private String firstName;
    private String lastName;
    private int age;

    private final int KEY = 5;
    private final int ALPHABET = 26;

    public Student() {

    }

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    private String encryptionText(String text) {
        char[] symbols = text.toCharArray();
        char[] encryptionSymbols = new char[symbols.length];
        int counter = 0;
        for (char symbol : symbols) {
            if (symbol >= 'A' && symbol <= 'Z') {
                if (symbol + KEY <= 'Z') {
                    encryptionSymbols[counter] = (char) (symbol + KEY);
                } else {
                    encryptionSymbols[counter] = (char) (symbol + KEY - ALPHABET);
                }
            }
            if (symbol >= 'a' && symbol <= 'z') {
                if (symbol + KEY <= 'z') {
                    encryptionSymbols[counter] = (char) (symbol + KEY);
                } else {
                    encryptionSymbols[counter] = (char) (symbol + KEY - ALPHABET);
                }
            }
            counter++;
        }
        String result = "";
        for (char symbol : encryptionSymbols) {
            result += symbol;
        }
        return result;
    }

    private String transcriptText(String text) {
        char[] symbols = text.toCharArray();
        char[] encryptionSymbols = new char[symbols.length];
        int counter = 0;
        for (char symbol : symbols) {
            if (symbol >= 'A' && symbol <= 'Z') {
                if (symbol - KEY >= 'A') {
                    encryptionSymbols[counter] = (char) (symbol - KEY);
                } else {
                    encryptionSymbols[counter] = (char) (symbol - KEY + ALPHABET);
                }
            }
            if (symbol >= 'a' && symbol <= 'z') {
                if (symbol - KEY >= 'a') {
                    encryptionSymbols[counter] = (char) (symbol - KEY);
                } else {
                    encryptionSymbols[counter] = (char) (symbol - KEY + ALPHABET);
                }
            }
            counter++;
        }
        String result = "";
        for (char symbol : encryptionSymbols) {
            result += symbol;
        }
        return result;
    }

    private int encryptionInt(int x) {
        int result = x * x + 11;
        return result;
    }

    private int transcriptInt(int x) {
        int result = (int) Math.sqrt(x - 11);
        return result;
    }


    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(encryptionText(firstName));
        out.writeObject(encryptionText(lastName));
        out.writeInt(encryptionInt(age));
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        firstName = transcriptText((String) in.readObject());
        lastName = transcriptText((String) in.readObject());
        age = transcriptInt(in.readInt());
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
