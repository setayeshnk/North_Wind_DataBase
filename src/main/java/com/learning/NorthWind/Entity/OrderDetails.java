package com.learning.NorthWind.Entity;

import javax.persistence.*;

@Entity
@Table(name = "Order_Details",schema = "public")
public class OrderDetails {
    @ManyToOne(targetEntity = Products.class , cascade = CascadeType.ALL)
    @JoinColumn(name = "Product_Id")
    private Products products;

    @ManyToOne(targetEntity = Orders.class , cascade = CascadeType.ALL)
    @JoinColumn(name = "Order_Id")
    private  Orders orderId;

    @Column(name = "Unit_Price",nullable = false)
    private String unitPrice;
    @Column(name = "Quantity",nullable = false)
    private String quantity;
    @Column(name = "Discount",nullable = false)
    private String discount;


    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getDiscount() {
        return discount;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public Orders getOrderId() {
        return orderId;
    }

    public void setOrderId(Orders orderId) {
        this.orderId = orderId;
    }
}
