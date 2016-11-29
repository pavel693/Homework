package com.kharchenko.departments;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Department {

    private String name;
    private final List<Prorectorat> prorectorates = new ArrayList<>();
    private Department highDepartment;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addProrectorates(Prorectorat prorectorat, Department department) {
        prorectorates.add(prorectorat);
        prorectorat.setHighDepartment(department);
    }

    public Department getHighDepartment() {
        return highDepartment;
    }

    public void setHighDepartment(Department department) {
        this.highDepartment = department;
    }

    List<Prorectorat> getList() {
        return prorectorates;
    }

    public String print() {
        Queue<Prorectorat> queue = new LinkedList<>();
        StringBuilder builder = new StringBuilder();
        List<Prorectorat> temp;
        String tempClass = "";
        builder.append(name + "\n");
        for (int i = 0; i < prorectorates.size(); i++) {
            queue.add(prorectorates.get(i));
            builder.append(prorectorates.get(i).getName());
            if (i < prorectorates.size() - 1) {
                builder.append(", ");
            }
            tempClass = String.valueOf(prorectorates.getClass());
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
