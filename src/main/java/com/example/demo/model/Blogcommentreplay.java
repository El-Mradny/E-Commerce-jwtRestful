package com.example.demo.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Blogcommentreplay {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private long id;
    @Basic
    @Column(name = "REPLAY")
    private String replay;
    @Basic
    @Column(name = "USERID")
    private String userid;
    @Basic
    @Column(name = "BLOGCOMMENTID")
    private Long blogcommentid;
    @Basic
    @Column(name = "COMMENTDATE")
    private Timestamp commentdate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getReplay() {
        return replay;
    }

    public void setReplay(String replay) {
        this.replay = replay;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Long getBlogcommentid() {
        return blogcommentid;
    }

    public void setBlogcommentid(Long blogcommentid) {
        this.blogcommentid = blogcommentid;
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
        Blogcommentreplay that = (Blogcommentreplay) o;
        return id == that.id && Objects.equals(replay, that.replay) && Objects.equals(userid, that.userid) && Objects.equals(blogcommentid, that.blogcommentid) && Objects.equals(commentdate, that.commentdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, replay, userid, blogcommentid, commentdate);
    }
}
