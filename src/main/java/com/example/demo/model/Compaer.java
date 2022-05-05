package com.example.demo.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Compaer {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private long id;
    @Basic
    @Column(name = "USERID")
    private String userid;
    @Basic
    @Column(name = "PRODUCTID")
    private Long productid;

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

    public Long getProductid() {
        return productid;
    }

    public void setProductid(Long productid) {
        this.productid = productid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Compaer compaer = (Compaer) o;
        return id == compaer.id && Objects.equals(userid, compaer.userid) && Objects.equals(productid, compaer.productid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userid, productid);
    }
}
