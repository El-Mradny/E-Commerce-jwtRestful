package com.example.demo.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Packageproduct {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private long id;
    @Basic
    @Column(name = "PACKAGEID")
    private long packageid;
    @Basic
    @Column(name = "PRODUCTID")
    private long productid;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPackageid() {
        return packageid;
    }

    public void setPackageid(long packageid) {
        this.packageid = packageid;
    }

    public long getProductid() {
        return productid;
    }

    public void setProductid(long productid) {
        this.productid = productid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Packageproduct that = (Packageproduct) o;
        return id == that.id && packageid == that.packageid && productid == that.productid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, packageid, productid);
    }
}
