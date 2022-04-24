package com.example.demo.model;

import javax.persistence.*;
import java.sql.Timestamp;
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
    @Column(name = "DIAGNOSTICID")
    private long diagnosticid;
    @Basic
    @Column(name = "RESULT")
    private String result;
    @Basic
    @Column(name = "UPDATED")
    private Timestamp updated;

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

    public long getDiagnosticid() {
        return diagnosticid;
    }

    public void setDiagnosticid(long diagnosticid) {
        this.diagnosticid = diagnosticid;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
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
        Cartitem cartitem = (Cartitem) o;
        return id == cartitem.id && cartid == cartitem.cartid && diagnosticid == cartitem.diagnosticid && Objects.equals(result, cartitem.result) && Objects.equals(updated, cartitem.updated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cartid, diagnosticid, result, updated);
    }
}
