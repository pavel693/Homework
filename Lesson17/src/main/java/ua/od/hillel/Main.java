package ua.od.hillel;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        City odessa = new City("Odessa", "Odesskaya");
        City kiev = new City("Kiev", "Kievskaya");
        City dnepr = new City("Dnepr", "Dnepropetrovskaya");
        City chernomorsk = new City("Chernomorsk", "Odesskaya");

        List<Student> students = new ArrayList<>();
        students.add(new Student("Vasya", 22, odessa));
        students.add(new Student("Petya", 19, odessa));
        students.add(new Student("Boris", 18, kiev));
        students.add(new Student("Oleg", 20, dnepr));
        students.add(new Student("Jenya", 19, dnepr));
        students.add(new Student("Igor", 19, dnepr));
        students.add(new Student("Aleks", 21, chernomorsk));

        System.out.println(students);
        System.out.println();

        Collections.sort(students);
        System.out.println(students);
        System.out.println();

        StudentAgeComparator studentAgeComparator = new StudentAgeComparator();
        Collections.sort(students, studentAgeComparator);
        System.out.println(students);
        System.out.println();

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getCity().equals(o2.getCity())) {
                    if (o1.getName().equals(o2.getName())) {
                        return o1.getAge() - o2.getAge();
                    }
                    return o1.getName().compareTo(o2.getName());
                }
                return o1.getCity().compareTo(o2.getCity());
            }
        });
        System.out.println(students);
    }
}
