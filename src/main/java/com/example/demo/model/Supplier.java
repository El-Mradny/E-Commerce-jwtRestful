package com.example.demo.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Supplier {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private long id;
    @Basic
    @Column(name = "USERID")
    private String userid;
    @Basic
    @Column(name = "COMPANYNAME")
    private String companyname;
    @Basic
    @Column(name = "EMAIL")
    private String email;
    @Basic
    @Column(name = "PHONE")
    private String phone;
    @Basic
    @Column(name = "FAX")
    private String fax;
    @Basic
    @Column(name = "POBOX")
    private String pobox;

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

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getPobox() {
        return pobox;
    }

    public void setPobox(String pobox) {
        this.pobox = pobox;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Supplier supplier = (Supplier) o;
        return id == supplier.id && Objects.equals(userid, supplier.userid) && Objects.equals(companyname, supplier.companyname) && Objects.equals(email, supplier.email) && Objects.equals(phone, supplier.phone) && Objects.equals(fax, supplier.fax) && Objects.equals(pobox, supplier.pobox);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userid, companyname, email, phone, fax, pobox);
    }
}
