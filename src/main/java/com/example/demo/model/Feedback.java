package com.example.demo.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Feedback {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private long id;
    @Basic
    @Column(name = "COMMENT")
    private String comment;
    @Basic
    @Column(name = "RATING")
    private Double rating;
    @Basic
    @Column(name = "PUBLISH")
    private String publish;
    @Basic
    @Column(name = "USERID")
    private String userid;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feedback feedback = (Feedback) o;
        return id == feedback.id && Objects.equals(comment, feedback.comment) && Objects.equals(rating, feedback.rating) && Objects.equals(publish, feedback.publish) && Objects.equals(userid, feedback.userid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, comment, rating, publish, userid);
    }
}
