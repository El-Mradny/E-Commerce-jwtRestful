package com.example.demo.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Physician {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private long id;
    @Basic
    @Column(name = "NAME")
    private String name;
    @Basic
    @Column(name = "SPECIALTY")
    private String specialty;
    @Basic
    @Column(name = "ADDRESS")
    private String address;
    @Basic
    @Column(name = "NOTE")
    private String note;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
        Physician physician = (Physician) o;
        return id == physician.id && Objects.equals(name, physician.name) && Objects.equals(specialty, physician.specialty) && Objects.equals(address, physician.address) && Objects.equals(note, physician.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, specialty, address, note);
    }
}
