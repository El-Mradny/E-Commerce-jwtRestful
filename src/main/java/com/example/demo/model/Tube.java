package com.example.demo.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Tube {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private long id;
    @Basic
    @Column(name = "NAME")
    private String name;
    @Basic
    @Column(name = "IMAGE")
    private String image;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tube tube = (Tube) o;
        return id == tube.id && Objects.equals(name, tube.name) && Objects.equals(image, tube.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, image);
    }
}
