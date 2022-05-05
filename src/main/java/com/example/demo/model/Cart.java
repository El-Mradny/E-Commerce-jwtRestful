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
    @Column(name = "STATUS")
    private String status;
    @Basic
    @Column(name = "USERID")
    private String userid;
    @Basic
    @Column(name = "PAYMENTID")
    private Long paymentid;
    @Basic
    @Column(name = "SHIPPINGID")
    private Long shippingid;
    @Basic
    @Column(name = "CHECKOUTDATE")
    private Timestamp checkoutdate;
    @Basic
    @Column(name = "ORDERSTATUS")
    private String orderstatus;
    @Basic
    @Column(name = "TOTAL")
    private Double total;
    @Basic
    @Column(name = "DISCOUNTID")
    private Long discountid;
    @Basic
    @Column(name = "SHIPPINGCOST")
    private Long shippingcost;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Long getPaymentid() {
        return paymentid;
    }

    public void setPaymentid(Long paymentid) {
        this.paymentid = paymentid;
    }

    public Long getShippingid() {
        return shippingid;
    }

    public void setShippingid(Long shippingid) {
        this.shippingid = shippingid;
    }

    public Timestamp getCheckoutdate() {
        return checkoutdate;
    }

    public void setCheckoutdate(Timestamp checkoutdate) {
        this.checkoutdate = checkoutdate;
    }

    public String getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Long getDiscountid() {
        return discountid;
    }

    public void setDiscountid(Long discountid) {
        this.discountid = discountid;
    }

    public Long getShippingcost() {
        return shippingcost;
    }

    public void setShippingcost(Long shippingcost) {
        this.shippingcost = shippingcost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return id == cart.id && Objects.equals(status, cart.status) && Objects.equals(userid, cart.userid) && Objects.equals(paymentid, cart.paymentid) && Objects.equals(shippingid, cart.shippingid) && Objects.equals(checkoutdate, cart.checkoutdate) && Objects.equals(orderstatus, cart.orderstatus) && Objects.equals(total, cart.total) && Objects.equals(discountid, cart.discountid) && Objects.equals(shippingcost, cart.shippingcost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, userid, paymentid, shippingid, checkoutdate, orderstatus, total, discountid, shippingcost);
    }
}
