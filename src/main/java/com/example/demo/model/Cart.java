package com.example.demo.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Cart {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private long id;
    @Basic
    @Column(name = "USERID")
    private String userid;
    @Basic
    @Column(name = "PATIENTID")
    private long patientid;
    @Basic
    @Column(name = "PHYSICIANID")
    private long physicianid;
    @Basic
    @Column(name = "REPID")
    private long repid;
    @Basic
    @Column(name = "DISCOUNTID")
    private Long discountid;
    @Basic
    @Column(name = "TOTAL")
    private Double total;
    @Basic
    @Column(name = "DISCOUNT")
    private Double discount;
    @Basic
    @Column(name = "STATUS")
    private String status;
    @Basic
    @Column(name = "CREATED")
    private Timestamp created;
    @Basic
    @Column(name = "UPDATED")
    private Timestamp updated;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public long getPatientid() {
        return patientid;
    }

    public void setPatientid(long patientid) {
        this.patientid = patientid;
    }

    public long getPhysicianid() {
        return physicianid;
    }

    public void setPhysicianid(long physicianid) {
        this.physicianid = physicianid;
    }

    public long getRepid() {
        return repid;
    }

    public void setRepid(long repid) {
        this.repid = repid;
    }

    public Long getDiscountid() {
        return discountid;
    }

    public void setDiscountid(Long discountid) {
        this.discountid = discountid;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public Timestamp getUpdated() {
        return updated;
    }

    public void setUpdated(Timestamp updated) {
        this.updated = updated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return id == cart.id && patientid == cart.patientid && physicianid == cart.physicianid && repid == cart.repid && Objects.equals(userid, cart.userid) && Objects.equals(discountid, cart.discountid) && Objects.equals(total, cart.total) && Objects.equals(discount, cart.discount) && Objects.equals(status, cart.status) && Objects.equals(created, cart.created) && Objects.equals(updated, cart.updated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userid, patientid, physicianid, repid, discountid, total, discount, status, created, updated);
    }
}
