package com.learning.NorthWind.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Customers",schema = "public")
public class Customers {

    @OneToMany
    private List<CustomerCustomerDemo> customerCustomerDemoList=new ArrayList();
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String customerId;
    @Column(name = "Company_Name",nullable = false)
    private String companyName;
    @Column(name = "Contact_Name")
    private String contactName;
    @Column(name = "Contact_Title")
    private String contactTitle;

    @Column(name = "Address")
    private String Address;

    @Column(name = "City")
    private String city;

    @Column(name = "Region")
    private String region;

    @Column(name = "Postal_Code")
    private String postalCode;

    @Column(name = "Country")
    private String contry;

    @Column(name = "Phone")
    private String phone;

    @Column(name = "Fax")
    private String fax;


    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactTitle() {
        return contactTitle;
    }

    public void setContactTitle(String contactTitle) {
        this.contactTitle = contactTitle;
    }

    public List<CustomerCustomerDemo> getCustomerCustomerDemoList() {
        return customerCustomerDemoList;
    }

    public void setCustomerCustomerDemoList(List<CustomerCustomerDemo> customerCustomerDemoList) {
        this.customerCustomerDemoList = customerCustomerDemoList;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getContry() {
        return contry;
    }

    public void setContry(String contry) {
        this.contry = contry;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }
}
