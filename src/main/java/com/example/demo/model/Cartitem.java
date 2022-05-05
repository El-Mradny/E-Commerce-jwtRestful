package com.example.demo.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Cartitem {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private long id;
    @Basic
    @Column(name = "CARTID")
    private long cartid;
    @Basic
    @Column(name = "PRODUCTID")
    private Long productid;
    @Basic
    @Column(name = "PACKAGEID")
    private Long packageid;
    @Basic
    @Column(name = "PRODUCTQTY")
    private Long productqty;
    @Basic
    @Column(name = "PACKAGEQTY")
    private Long packageqty;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCartid() {
        return cartid;
    }

    public void setCartid(long cartid) {
        this.cartid = cartid;
    }

    public Long getProductid() {
        return productid;
    }

    public void setProductid(Long productid) {
        this.productid = productid;
    }

    public Long getPackageid() {
        return packageid;
    }

    public void setPackageid(Long packageid) {
        this.packageid = packageid;
    }

    public Long getProductqty() {
        return productqty;
    }

    public void setProductqty(Long productqty) {
        this.productqty = productqty;
    }

    public Long getPackageqty() {
        return packageqty;
    }

    public void setPackageqty(Long packageqty) {
        this.packageqty = packageqty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cartitem cartitem = (Cartitem) o;
        return id == cartitem.id && cartid == cartitem.cartid && Objects.equals(productid, cartitem.productid) && Objects.equals(packageid, cartitem.packageid) && Objects.equals(productqty, cartitem.productqty) && Objects.equals(packageqty, cartitem.packageqty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cartid, productid, packageid, productqty, packageqty);
    }
}
