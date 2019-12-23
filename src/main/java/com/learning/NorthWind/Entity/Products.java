package com.learning.NorthWind.Entity;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table(name = "Products" , schema = "public")
@Entity
public class Products {
    @OneToMany(targetEntity = OrderDetails.class)
    private List<OrderDetails> orderDetailsList=new ArrayList();

    @OneToMany(targetEntity = CustomerDemographics.class)
    private List<CustomerDemographics> demographicsList=new ArrayList();


@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
@Column(name = "Product_Name" , nullable = false)
    private String productName;

        //implement a foreign key from suppliers table
    @ManyToOne(cascade=CascadeType.ALL,targetEntity = Suppliers.class)
   @JoinColumn(name = "Supplier_Id")
    private Suppliers supplierId;

    @ManyToOne(cascade =CascadeType.ALL,targetEntity = Categories.class)
    @JoinColumn (name = "Category_Id")
    private int categoryId;

@Column(name = "Quantity_Per_Unit")
    private String quantityPerUnit;

@Column(name = "Unit_Price")
    private String unitPrice;

@Column(name = "Units_In_Stock")
    private int unitsInStock;

@Column(name = "Units_On_Order")
    private int unitsOnOrder;

@Column(name = "Reorder_Level")
    private int reorderLevel;

@Column(name = "Discontinued" , nullable = false)
    private int discontinued;


        //getter and setter methods
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getQuantityPerUnit() {
        return quantityPerUnit;
    }

    public void setQuantityPerUnit(String quantityPerUnit) {
        this.quantityPerUnit = quantityPerUnit;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public int getUnitsOnOrder() {
        return unitsOnOrder;
    }

    public void setUnitsOnOrder(int unitsOnOrder) {
        this.unitsOnOrder = unitsOnOrder;
    }

    public int getReorderLevel() {
        return reorderLevel;
    }

    public void setReorderLevel(int reorderLevel) {
        this.reorderLevel = reorderLevel;
    }

    public int getDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(int discontinued) {
        this.discontinued = discontinued;
    }

    public List<OrderDetails> getOrderDetails() {
        return orderDetailsList;
    }

    public void setOrderDetails(List<OrderDetails> orderDetails) {
        this.orderDetailsList = orderDetails;
    }

    public List<OrderDetails> getOrderDetailsList() {
        return orderDetailsList;
    }

    public void setOrderDetailsList(List<OrderDetails> orderDetailsList) {
        this.orderDetailsList = orderDetailsList;
    }



    public List<CustomerDemographics> getDemographicsList() {
        return demographicsList;
    }

    public void setDemographicsList(List<CustomerDemographics> demographicsList) {
        this.demographicsList = demographicsList;
    }


    public void setSupplierId(Suppliers supplierId) {
        this.supplierId = supplierId;
    }

    public Suppliers getSupplierId() {
        return supplierId;
    }
}
