package com.learning.NorthWind.Entity;

import javax.persistence.*;

@Entity
@Table(name = "CustomerDemographics",schema = "public")
public class CustomerDemographics {
    @ManyToOne(targetEntity = CustomerCustomerDemo.class , cascade = CascadeType.ALL)
    @JoinColumn(name = "Customer_Type_Id")
    private CustomerCustomerDemo customerTypeId;
   @Column(name = "Customer_Description")
    private String customerDescription;



    public String getCustomerDescription() {
        return customerDescription;
    }

    public void setCustomerDescription(String customerDescription) {
        this.customerDescription = customerDescription;
    }

    public CustomerCustomerDemo getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(CustomerCustomerDemo customerTypeId) {
        this.customerTypeId = customerTypeId;
    }
}
