package com.example.demo.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Package {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private long id;
    @Basic
    @Column(name = "NAME")
    private String name;
    @Basic
    @Column(name = "PRICE")
    private Double price;
    @Basic
    @Column(name = "STARTDATE")
    private Timestamp startdate;
    @Basic
    @Column(name = "ENDDATE")
    private Timestamp enddate;
    @Basic
    @Column(name = "PUBLISH")
    private String publish;
    @Basic
    @Column(name = "QTY")
    private Long qty;

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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Timestamp getStartdate() {
        return startdate;
    }

    public void setStartdate(Timestamp startdate) {
        this.startdate = startdate;
    }

    public Timestamp getEnddate() {
        return enddate;
    }

    public void setEnddate(Timestamp enddate) {
        this.enddate = enddate;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public Long getQty() {
        return qty;
    }

    public void setQty(Long qty) {
        this.qty = qty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Package aPackage = (Package) o;
        return id == aPackage.id && Objects.equals(name, aPackage.name) && Objects.equals(price, aPackage.price) && Objects.equals(startdate, aPackage.startdate) && Objects.equals(enddate, aPackage.enddate) && Objects.equals(publish, aPackage.publish) && Objects.equals(qty, aPackage.qty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, startdate, enddate, publish, qty);
    }
}
