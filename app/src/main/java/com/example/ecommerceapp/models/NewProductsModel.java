package com.example.ecommerceapp.models;

import java.io.Serializable;

public class NewProductsModel implements Serializable {

    String description;
    String name;
    String rating;
    int price;
    String img_url;

    public NewProductsModel() {
    }

    public NewProductsModel(String name, String description, String rating, int price, String img_url) {
        this.name = name;
        this.description = description;
        this.rating = rating;
        this.price = price;
        this.img_url = img_url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
