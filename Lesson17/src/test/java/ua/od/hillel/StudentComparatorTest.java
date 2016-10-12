package ua.od.hillel;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class StudentComparatorTest {
    List<Student> students;
    City odessa = new City("Odessa", "Odesskaya");
    City kiev = new City("Kiev", "Kievskaya");
    City dnepr = new City("Dnepr", "Dnepropetrovskaya");
    City chernomorsk = new City("Chernomorsk", "Odesskaya");

    @Before
    public void setUp() {
        students = new ArrayList<>();
        students.add(new Student("Vasya", 22, odessa));
        students.add(new Student("Boris", 18, kiev));
        students.add(new Student("Oleg", 20, dnepr));
        students.add(new Student("Jenya", 19, dnepr));
        students.add(new Student("Aleks", 21, chernomorsk));
    }

    @Test
    public void studentSortNameTest() {
        List<Student> expectedResult = new ArrayList<>();
        expectedResult.add(new Student("Aleks", 21, chernomorsk));
        expectedResult.add(new Student("Boris", 18, kiev));
        expectedResult.add(new Student("Jenya", 19, dnepr));
        expectedResult.add(new Student("Oleg", 20, dnepr));
        expectedResult.add(new Student("Vasya", 22, odessa));
        Collections.sort(students);
        assertThat(expectedResult, is(students));
    }

    @Test
    public void studentSortAgeTest() {
        List<Student> expectedResult = new ArrayList<>();
        expectedResult.add(new Student("Vasya", 22, odessa));
        expectedResult.add(new Student("Aleks", 21, chernomorsk));
        expectedResult.add(new Student("Oleg", 20, dnepr));
        expectedResult.add(new Student("Jenya", 19, dnepr));
        expectedResult.add(new Student("Boris", 18, kiev));
        StudentAgeComparator studentAgeComparator = new StudentAgeComparator();
        Collections.sort(students, studentAgeComparator);
        assertThat(expectedResult, is(students));
    }

    @Test
    public void studentSortCityTest() {
        List<Student> expectedResult = new ArrayList<>();
        expectedResult.add(new Student("Aleks", 21, chernomorsk));
        expectedResult.add(new Student("Jenya", 19, dnepr));
        expectedResult.add(new Student("Oleg", 20, dnepr));
        expectedResult.add(new Student("Boris", 18, kiev));
        expectedResult.add(new Student("Vasya", 22, odessa));
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
        assertThat(expectedResult, is(students));
    }
}
