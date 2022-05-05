package com.example.demo.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Rating {
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
    @Basic
    @Column(name = "REVIWECOMMENT")
    private String reviwecomment;
    @Basic
    @Column(name = "STARS")
    private Long stars;
    @Basic
    @Column(name = "IMAGE")
    private String image;
    @Basic
    @Column(name = "RATINGDATE")
    private Timestamp ratingdate;

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

    public String getReviwecomment() {
        return reviwecomment;
    }

    public void setReviwecomment(String reviwecomment) {
        this.reviwecomment = reviwecomment;
    }

    public Long getStars() {
        return stars;
    }

    public void setStars(Long stars) {
        this.stars = stars;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Timestamp getRatingdate() {
        return ratingdate;
    }

    public void setRatingdate(Timestamp ratingdate) {
        this.ratingdate = ratingdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rating rating = (Rating) o;
        return id == rating.id && Objects.equals(userid, rating.userid) && Objects.equals(productid, rating.productid) && Objects.equals(reviwecomment, rating.reviwecomment) && Objects.equals(stars, rating.stars) && Objects.equals(image, rating.image) && Objects.equals(ratingdate, rating.ratingdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userid, productid, reviwecomment, stars, image, ratingdate);
    }
}
