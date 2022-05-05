package com.example.demo.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Store {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private long id;
    @Basic
    @Column(name = "SUPPLIERID")
    private Long supplierid;
    @Basic
    @Column(name = "USERID")
    private String userid;
    @Basic
    @Column(name = "PRODUCTID")
    private Long productid;
    @Basic
    @Column(name = "PRODUCTREALPRICE")
    private Long productrealprice;
    @Basic
    @Column(name = "TOTALPRICEPAID")
    private String totalpricepaid;
    @Basic
    @Column(name = "PAYMENTDATE")
    private Timestamp paymentdate;
    @Basic
    @Column(name = "NOTE")
    private String note;
    @Basic
    @Column(name = "AVAILABLEQTY")
    private Long availableqty;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Long supplierid) {
        this.supplierid = supplierid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Long getProductid() {
        return productid;
    }

    public void setProductid(Long productid) {
        this.productid = productid;
    }

    public Long getProductrealprice() {
        return productrealprice;
    }

    public void setProductrealprice(Long productrealprice) {
        this.productrealprice = productrealprice;
    }

    public String getTotalpricepaid() {
        return totalpricepaid;
    }

    public void setTotalpricepaid(String totalpricepaid) {
        this.totalpricepaid = totalpricepaid;
    }

    public Timestamp getPaymentdate() {
        return paymentdate;
    }

    public void setPaymentdate(Timestamp paymentdate) {
        this.paymentdate = paymentdate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Long getAvailableqty() {
        return availableqty;
    }

    public void setAvailableqty(Long availableqty) {
        this.availableqty = availableqty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Store store = (Store) o;
        return id == store.id && Objects.equals(supplierid, store.supplierid) && Objects.equals(userid, store.userid) && Objects.equals(productid, store.productid) && Objects.equals(productrealprice, store.productrealprice) && Objects.equals(totalpricepaid, store.totalpricepaid) && Objects.equals(paymentdate, store.paymentdate) && Objects.equals(note, store.note) && Objects.equals(availableqty, store.availableqty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, supplierid, userid, productid, productrealprice, totalpricepaid, paymentdate, note, availableqty);
    }
}
