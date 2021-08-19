package com.mindhub.Lollapalooza.models;

import javax.persistence.*;
import javax.swing.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private double price;
    private String type;
    private String description;
    private int stock;
    private JLabel image;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="Detail_id")
    private Details detail;

    public Product(){}

    public Product(String name, double price, String type, String description, int stock, JLabel image) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.description = description;
        this.stock = stock;
        this.image = image;
    }

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public int getStock() { return stock; }

    public void setStock(int stock) { this.stock = stock; }

    public Details getDetail() {
        return detail;
    }

    public void setDetail(Details detail) {
        this.detail = detail;
    }

    public JLabel getImage() {
        return image;
    }

    public void setImage(JLabel image) {
        this.image = image;
    }
}
