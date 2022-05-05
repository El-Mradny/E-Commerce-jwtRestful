package com.example.demo.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Sale {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private long id;
    @Basic
    @Column(name = "PRODUCTID")
    private long productid;
    @Basic
    @Column(name = "DISCOUNTPERCENT")
    private int discountpercent;
    @Basic
    @Column(name = "STARTDATE")
    private Timestamp startdate;
    @Basic
    @Column(name = "ENDDATE")
    private Timestamp enddate;
    @Basic
    @Column(name = "PUBLISH")
    private String publish;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getProductid() {
        return productid;
    }

    public void setProductid(long productid) {
        this.productid = productid;
    }

    public int getDiscountpercent() {
        return discountpercent;
    }

    public void setDiscountpercent(int discountpercent) {
        this.discountpercent = discountpercent;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sale sale = (Sale) o;
        return id == sale.id && productid == sale.productid && discountpercent == sale.discountpercent && Objects.equals(startdate, sale.startdate) && Objects.equals(enddate, sale.enddate) && Objects.equals(publish, sale.publish);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productid, discountpercent, startdate, enddate, publish);
    }
}
