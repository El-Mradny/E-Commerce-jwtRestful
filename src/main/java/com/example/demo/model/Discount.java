package com.example.demo.model;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Discount {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private long id;
    @Basic
    @Column(name = "DISCOUNTVALUE")
    private BigInteger discountvalue;
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
    @Column(name = "DESCRIPTION")
    private String description;
    @Basic
    @Column(name = "DISCOUNTCODE")
    private String discountcode;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BigInteger getDiscountvalue() {
        return discountvalue;
    }

    public void setDiscountvalue(BigInteger discountvalue) {
        this.discountvalue = discountvalue;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDiscountcode() {
        return discountcode;
    }

    public void setDiscountcode(String discountcode) {
        this.discountcode = discountcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Discount discount = (Discount) o;
        return id == discount.id && Objects.equals(discountvalue, discount.discountvalue) && Objects.equals(startdate, discount.startdate) && Objects.equals(enddate, discount.enddate) && Objects.equals(publish, discount.publish) && Objects.equals(description, discount.description) && Objects.equals(discountcode, discount.discountcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, discountvalue, startdate, enddate, publish, description, discountcode);
    }
}
