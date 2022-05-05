package com.example.demo.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Product {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private long id;
    @Basic
    @Column(name = "NAME")
    private String name;
    @Basic
    @Column(name = "PRICE")
    private long price;
    @Basic
    @Column(name = "SUNLIGHT")
    private String sunlight;
    @Basic
    @Column(name = "WATER")
    private String water;
    @Basic
    @Column(name = "TEMPERATURE")
    private String temperature;
    @Basic
    @Column(name = "MEASURES")
    private String measures;
    @Basic
    @Column(name = "CATEGORY")
    private String category;
    @Basic
    @Column(name = "QUANTITY")
    private long quantity;
    @Basic
    @Column(name = "DATE")
    private Timestamp date;
    @Basic
    @Column(name = "IMAGE")
    private String image;
    @Basic
    @Column(name = "DESCRIPTION")
    private String description;
    @Basic
    @Column(name = "SOLDCOUNT")
    private Long soldcount;

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

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getSunlight() {
        return sunlight;
    }

    public void setSunlight(String sunlight) {
        this.sunlight = sunlight;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getMeasures() {
        return measures;
    }

    public void setMeasures(String measures) {
        this.measures = measures;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getSoldcount() {
        return soldcount;
    }

    public void setSoldcount(Long soldcount) {
        this.soldcount = soldcount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && price == product.price && quantity == product.quantity && Objects.equals(name, product.name) && Objects.equals(sunlight, product.sunlight) && Objects.equals(water, product.water) && Objects.equals(temperature, product.temperature) && Objects.equals(measures, product.measures) && Objects.equals(category, product.category) && Objects.equals(date, product.date) && Objects.equals(image, product.image) && Objects.equals(description, product.description) && Objects.equals(soldcount, product.soldcount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, sunlight, water, temperature, measures, category, quantity, date, image, description, soldcount);
    }
}
