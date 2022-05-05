package com.example.demo.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Wishlist {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private long id;
    @Basic
    @Column(name = "USERID")
    private String userid;
    @Basic
    @Column(name = "PACKAGEID")
    private Long packageid;
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

    public Long getPackageid() {
        return packageid;
    }

    public void setPackageid(Long packageid) {
        this.packageid = packageid;
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
        Wishlist wishlist = (Wishlist) o;
        return id == wishlist.id && Objects.equals(userid, wishlist.userid) && Objects.equals(packageid, wishlist.packageid) && Objects.equals(productid, wishlist.productid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userid, packageid, productid);
    }
}
