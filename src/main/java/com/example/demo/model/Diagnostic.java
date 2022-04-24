package com.example.demo.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Diagnostic {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private long id;
    @Basic
    @Column(name = "NAME")
    private String name;
    @Basic
    @Column(name = "TUBEID")
    private long tubeid;
    @Basic
    @Column(name = "SPECIMEN")
    private String specimen;
    @Basic
    @Column(name = "SHORT")
    private String code;
    @Basic
    @Column(name = "TRANSPORT")
    private String transport;
    @Basic
    @Column(name = "PRICE")
    private Double price;

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

    public long getTubeid() {
        return tubeid;
    }

    public void setTubeid(long tubeid) {
        this.tubeid = tubeid;
    }

    public String getSpecimen() {
        return specimen;
    }

    public void setSpecimen(String specimen) {
        this.specimen = specimen;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Diagnostic that = (Diagnostic) o;
        return id == that.id && tubeid == that.tubeid && Objects.equals(name, that.name) && Objects.equals(specimen, that.specimen) && Objects.equals(code, that.code) && Objects.equals(transport, that.transport) && Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, tubeid, specimen, code, transport, price);
    }
}
