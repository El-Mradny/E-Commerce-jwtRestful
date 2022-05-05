package com.example.demo.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Payment {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private long id;
    @Basic
    @Column(name = "METHOD")
    private String method;
    @Basic
    @Column(name = "CARDNUMBER")
    private String cardnumber;
    @Basic
    @Column(name = "CARDHOLDERNAME")
    private String cardholdername;
    @Basic
    @Column(name = "CVCCODE")
    private Long cvccode;
    @Basic
    @Column(name = "EXPIRYDATE")
    private Timestamp expirydate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }

    public String getCardholdername() {
        return cardholdername;
    }

    public void setCardholdername(String cardholdername) {
        this.cardholdername = cardholdername;
    }

    public Long getCvccode() {
        return cvccode;
    }

    public void setCvccode(Long cvccode) {
        this.cvccode = cvccode;
    }

    public Timestamp getExpirydate() {
        return expirydate;
    }

    public void setExpirydate(Timestamp expirydate) {
        this.expirydate = expirydate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return id == payment.id && Objects.equals(method, payment.method) && Objects.equals(cardnumber, payment.cardnumber) && Objects.equals(cardholdername, payment.cardholdername) && Objects.equals(cvccode, payment.cvccode) && Objects.equals(expirydate, payment.expirydate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, method, cardnumber, cardholdername, cvccode, expirydate);
    }
}
