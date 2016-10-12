package ua.od.hillel;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o2.getAge() == o1.getAge()) {
            return o1.getName().compareTo(o2.getName());
        }
        return o2.getAge() - o1.getAge();
    }
}
