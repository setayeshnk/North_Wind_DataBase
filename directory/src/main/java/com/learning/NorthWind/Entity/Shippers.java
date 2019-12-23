package com.learning.NorthWind.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Shippers",schema = "public")
public class Shippers {
    @OneToMany
    private List<Orders> ordersList=new ArrayList();
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int shipperId;
    @Column(name = "Company_Name",nullable = false)
    private String companyName;
    @Column(name = "Phone")
    private String phone;

    public int getShipperId() {
        return shipperId;
    }

    public void setShipperId(int shipperId) {
        this.shipperId = shipperId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Orders> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<Orders> ordersList) {
        this.ordersList = ordersList;
    }

}
