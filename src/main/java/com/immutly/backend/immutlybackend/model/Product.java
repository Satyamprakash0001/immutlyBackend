package com.immutly.backend.immutlybackend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
public class Product {

    @Id
    private Long id;
    
    private String productName;
    private String productDescription;
    private double price;
    private boolean availabilityStatus;

    public Product() {
    }

    public Product(String productName, String productDescription, double price, boolean availabilityStatus) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.price = price;
        this.availabilityStatus = availabilityStatus;
    }

    public Product(Long id, String productName, String productDescription, double price, boolean availabilityStatus) {
        this.id = id;
        this.productName = productName;
        this.productDescription = productDescription;
        this.price = price;
        this.availabilityStatus = availabilityStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean getAvailabilityStatus() {
        return availabilityStatus;
    }
    
    public void setAvailabilityStatus(boolean availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", productName=" + productName + ", productDescription=" + productDescription
                + ", price=" + price + ", availabilityStatus=" + availabilityStatus + "]";
    }

    
}