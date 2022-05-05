package com.example.demo.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Bloglike {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private long id;
    @Basic
    @Column(name = "LIKECOUNT")
    private Integer likecount;
    @Basic
    @Column(name = "DISLIKECOUNT")
    private Integer dislikecount;
    @Basic
    @Column(name = "USERID")
    private String userid;
    @Basic
    @Column(name = "BLOGID")
    private Long blogid;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getLikecount() {
        return likecount;
    }

    public void setLikecount(Integer likecount) {
        this.likecount = likecount;
    }

    public Integer getDislikecount() {
        return dislikecount;
    }

    public void setDislikecount(Integer dislikecount) {
        this.dislikecount = dislikecount;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Long getBlogid() {
        return blogid;
    }

    public void setBlogid(Long blogid) {
        this.blogid = blogid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bloglike bloglike = (Bloglike) o;
        return id == bloglike.id && Objects.equals(likecount, bloglike.likecount) && Objects.equals(dislikecount, bloglike.dislikecount) && Objects.equals(userid, bloglike.userid) && Objects.equals(blogid, bloglike.blogid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, likecount, dislikecount, userid, blogid);
    }
}
