package com.example.demo.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Blogcomment {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private long id;
    @Basic
    @Column(name = "COMMENT")
    private String comment;
    @Basic
    @Column(name = "USERID")
    private String userid;
    @Basic
    @Column(name = "BLOGID")
    private Long blogid;
    @Basic
    @Column(name = "COMMENTDATE")
    private Timestamp commentdate;

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

    public Timestamp getCommentdate() {
        return commentdate;
    }

    public void setCommentdate(Timestamp commentdate) {
        this.commentdate = commentdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Blogcomment that = (Blogcomment) o;
        return id == that.id && Objects.equals(comment, that.comment) && Objects.equals(userid, that.userid) && Objects.equals(blogid, that.blogid) && Objects.equals(commentdate, that.commentdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, comment, userid, blogid, commentdate);
    }
}
