package com.learning.NorthWind.Entity;

import javax.persistence.*;

@Entity
@Table(name = "CustomerCustomerDemo",schema = "public")
public class CustomerCustomerDemo {
    @ManyToOne(cascade = CascadeType.ALL , targetEntity = Customers.class)
    @JoinColumn(name = "Customer_Id")
    private Customers customerId;

    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String customerTypeId;

    public String getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(String customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public Customers getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customers customerId) {
        this.customerId = customerId;
    }
}
