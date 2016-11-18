package com.kharchenko.servlets;

import javax.persistence.*;

@Entity
@Table(name = "subjects")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int subjectId;

    private String name;

    public int getsubjectId() {
        return subjectId;
    }

    public void setsubjectId(int id) {
        this.subjectId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return subjectId + " " + name;
    }
}
