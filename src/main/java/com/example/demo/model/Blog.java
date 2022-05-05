package com.example.demo.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Blog {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private long id;
    @Basic
    @Column(name = "TITLE")
    private String title;
    @Basic
    @Column(name = "TEXT")
    private String text;
    @Basic
    @Column(name = "AUTHER")
    private String auther;
    @Basic
    @Column(name = "PUBLISHDATE")
    private Timestamp publishdate;
    @Basic
    @Column(name = "IMAGE")
    private String image;
    @Basic
    @Column(name = "VIEWSCOUNT")
    private Long viewscount;
    @Basic
    @Column(name = "READINGTIME")
    private String readingtime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public Timestamp getPublishdate() {
        return publishdate;
    }

    public void setPublishdate(Timestamp publishdate) {
        this.publishdate = publishdate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Long getViewscount() {
        return viewscount;
    }

    public void setViewscount(Long viewscount) {
        this.viewscount = viewscount;
    }

    public String getReadingtime() {
        return readingtime;
    }

    public void setReadingtime(String readingtime) {
        this.readingtime = readingtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Blog blog = (Blog) o;
        return id == blog.id && Objects.equals(title, blog.title) && Objects.equals(text, blog.text) && Objects.equals(auther, blog.auther) && Objects.equals(publishdate, blog.publishdate) && Objects.equals(image, blog.image) && Objects.equals(viewscount, blog.viewscount) && Objects.equals(readingtime, blog.readingtime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, text, auther, publishdate, image, viewscount, readingtime);
    }
}
