package com.example.demo.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Application {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private long id;
    @Basic
    @Column(name = "CV")
    private String cv;
    @Basic
    @Column(name = "USERID")
    private String userid;
    @Basic
    @Column(name = "ROLEAPPLYING")
    private String roleapplying;
    @Basic
    @Column(name = "APPLIEDDATE")
    private Timestamp applieddate;
    @Basic
    @Column(name = "STATUS")
    private String status;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getRoleapplying() {
        return roleapplying;
    }

    public void setRoleapplying(String roleapplying) {
        this.roleapplying = roleapplying;
    }

    public Timestamp getApplieddate() {
        return applieddate;
    }

    public void setApplieddate(Timestamp applieddate) {
        this.applieddate = applieddate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Application that = (Application) o;
        return id == that.id && Objects.equals(cv, that.cv) && Objects.equals(userid, that.userid) && Objects.equals(roleapplying, that.roleapplying) && Objects.equals(applieddate, that.applieddate) && Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cv, userid, roleapplying, applieddate, status);
    }
}
