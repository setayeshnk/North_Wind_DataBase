package com.learning.NorthWind.Entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Orders" , schema = "public")
public class Orders {
    @OneToMany
    private List<OrderDetails> orderDetailsList=new ArrayList();


    @ManyToOne
    private Shippers shippers;
    @ManyToOne
    private Employees employees;
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int orderId;

    @ManyToOne(targetEntity = Customers.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "Customer_Id")
     private Customers customerId;

   @ManyToOne(targetEntity = Employees.class , cascade = CascadeType.ALL)
    @JoinColumn(name = "Employee_Id")
    private Employees employeeId;

    @Column(name = "Order_Date")
  private Timestamp orderDate;
    @Column(name = "Required_Date")
  private Timestamp requiredDate;
    @Column(name = "Shipped_Date")
  private Timestamp shippedDate;
    @Column(name = "Ship_Via")
  private int shipVia;
    @Column(name = "Freight")
  private String freight;
    @Column(name = "Ship_Name")
  private String shipName;
    @Column(name = "Ship_Address")
  private String shpAddress;
    @Column(name = "Ship_City")
  private String shipCity;
    @Column(name = "Ship_Region")
  private String shipRegion;
    @Column(name = "Ship_Postal_Code")
  private String shipPostalCode;
    @Column(name = "Ship_Country")
  private String shipCountry;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }

    public Timestamp getRequiredDate() {
        return requiredDate;
    }

    public void setRequiredDate(Timestamp requiredDate) {
        this.requiredDate = requiredDate;
    }

    public Timestamp getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(Timestamp shippedDate) {
        this.shippedDate = shippedDate;
    }

    public int getShipVia() {
        return shipVia;
    }

    public void setShipVia(int shipVia) {
        this.shipVia = shipVia;
    }

    public String getFreight() {
        return freight;
    }

    public void setFreight(String freight) {
        this.freight = freight;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getShpAddress() {
        return shpAddress;
    }

    public void setShpAddress(String shpAddress) {
        this.shpAddress = shpAddress;
    }

    public String getShipCity() {
        return shipCity;
    }

    public void setShipCity(String shipCity) {
        this.shipCity = shipCity;
    }

    public String getShipRegion() {
        return shipRegion;
    }

    public void setShipRegion(String shipRegion) {
        this.shipRegion = shipRegion;
    }

    public String getShipPostalCode() {
        return shipPostalCode;
    }

    public void setShipPostalCode(String shipPostalCode) {
        this.shipPostalCode = shipPostalCode;
    }

    public String getShipCountry() {
        return shipCountry;
    }

    public void setShipCountry(String shipCountry) {
        this.shipCountry = shipCountry;
    }

    public List<OrderDetails> getOrderDetailsList() {
        return orderDetailsList;
    }

    public void setOrderDetailsList(List<OrderDetails> orderDetailsList) {
        this.orderDetailsList = orderDetailsList;
    }

    public Shippers getShippers() {
        return shippers;
    }

    public void setShippers(Shippers shippers) {
        this.shippers = shippers;
    }

    public Employees getEmployees() {
        return employees;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }

    public void setCustomerId(Customers customerId) {
        this.customerId = customerId;
    }

    public void setEmployeeId(Employees employeeId) {
        this.employeeId = employeeId;
    }
}
