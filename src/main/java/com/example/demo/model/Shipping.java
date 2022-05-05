package com.example.demo.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Shipping {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private long id;
    @Basic
    @Column(name = "USERID")
    private String userid;
    @Basic
    @Column(name = "COUNTRY")
    private String country;
    @Basic
    @Column(name = "CITY")
    private String city;
    @Basic
    @Column(name = "POBOX")
    private Long pobox;
    @Basic
    @Column(name = "ADDRESS")
    private String address;
    @Basic
    @Column(name = "STREETNUM")
    private Long streetnum;
    @Basic
    @Column(name = "EMAIL")
    private String email;
    @Basic
    @Column(name = "PHONENUMBER")
    private Long phonenumber;
    @Basic
    @Column(name = "SHIPPINGMETHOD")
    private String shippingmethod;
    @Basic
    @Column(name = "LONGITUDE")
    private String longitude;
    @Basic
    @Column(name = "LATITUDE")
    private String latitude;
    @Basic
    @Column(name = "NAME")
    private String name;

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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getPobox() {
        return pobox;
    }

    public void setPobox(Long pobox) {
        this.pobox = pobox;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getStreetnum() {
        return streetnum;
    }

    public void setStreetnum(Long streetnum) {
        this.streetnum = streetnum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(Long phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getShippingmethod() {
        return shippingmethod;
    }

    public void setShippingmethod(String shippingmethod) {
        this.shippingmethod = shippingmethod;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shipping shipping = (Shipping) o;
        return id == shipping.id && Objects.equals(userid, shipping.userid) && Objects.equals(country, shipping.country) && Objects.equals(city, shipping.city) && Objects.equals(pobox, shipping.pobox) && Objects.equals(address, shipping.address) && Objects.equals(streetnum, shipping.streetnum) && Objects.equals(email, shipping.email) && Objects.equals(phonenumber, shipping.phonenumber) && Objects.equals(shippingmethod, shipping.shippingmethod) && Objects.equals(longitude, shipping.longitude) && Objects.equals(latitude, shipping.latitude) && Objects.equals(name, shipping.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userid, country, city, pobox, address, streetnum, email, phonenumber, shippingmethod, longitude, latitude, name);
    }
}
