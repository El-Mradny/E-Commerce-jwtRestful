package com.example.demo.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Normal {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private long id;
    @Basic
    @Column(name = "TESTID")
    private long testid;
    @Basic
    @Column(name = "AGE")
    private int age;
    @Basic
    @Column(name = "NOTE")
    private String note;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTestid() {
        return testid;
    }

    public void setTestid(long testid) {
        this.testid = testid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Normal normal = (Normal) o;
        return id == normal.id && testid == normal.testid && age == normal.age && Objects.equals(note, normal.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, testid, age, note);
    }
}
