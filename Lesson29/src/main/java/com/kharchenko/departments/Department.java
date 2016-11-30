package com.kharchenko.departments;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Department {

    private String name;
    private final List<Department> departments = new ArrayList<>();
    private Department highDepartment;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addProrectorates(Prorectorat prorectorat, Department department) {
        departments.add(prorectorat);
        prorectorat.setHighDepartment(department);
    }

    public Department getHighDepartment() {
        return highDepartment;
    }

    public void setHighDepartment(Department department) {
        this.highDepartment = department;
    }

    List<Department> getList() {
        return departments;
    }

    public String print() {
        Queue<Department> queue = new LinkedList<>();
        StringBuilder builder = new StringBuilder();
        List<Department> temp;
        String tempClass = "";
        builder.append(name + "\n");
        for (int i = 0; i < departments.size(); i++) {
            queue.add(departments.get(i));
            builder.append(departments.get(i).getName());
            if (i < departments.size() - 1) {
                builder.append(", ");
            }
            tempClass = String.valueOf(departments.getClass());
        }
        builder.append("\n");

        while (!queue.isEmpty()) {
            if (tempClass.equals(String.valueOf(queue.peek().getClass()))) {
                builder.append("\n");
            }
            temp = queue.poll().getList();
            if (temp != null) {
                for (int i = 0; i < temp.size(); i++) {
                    if (temp.get(i).getClass() != Cathedra.class) {
                        queue.add(temp.get(i));
                    }
                    builder.append(temp.get(i).getName() + ", ");
                    tempClass = String.valueOf(temp.get(i).getClass());
                }
            }
        }
        return builder.toString();
    }

    @Override
    public String toString() {
        return name;
    }
}
