package ua.od.hillel;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private City city;

    Student(String name, int age, City city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Student student = (Student) o;
        if (this.name == null || student.name == null) return false;
        boolean nameResult = this.name.equals(student.name);
        boolean ageResult = this.age == student.age;
        boolean cityResult = this.city.equals(student.city);
        return nameResult && ageResult && cityResult;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public City getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city=" + city +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        if (this.name.equals(student.name)) {
            if (this.age == student.age) {
                return this.city.compareTo(student.city);
            }
            return this.age - student.age;
        }
        return this.name.compareTo(student.name);
    }
}
