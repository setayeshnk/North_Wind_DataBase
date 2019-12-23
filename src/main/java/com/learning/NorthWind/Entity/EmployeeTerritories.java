package com.learning.NorthWind.Entity;

import javax.persistence.*;

@Table(name = "Employee_Territories" , schema = "public")
@Entity
public class EmployeeTerritories {
    @ManyToOne
    private Categories categories;

    @OneToOne(targetEntity = Territories.class , cascade = CascadeType.ALL)
    @JoinColumn(name = "Territory_Id")
    private Territories territories;

    @OneToOne(targetEntity = Employees.class , cascade = CascadeType.ALL)
    @JoinColumn(name = "Employee_Id")
    private Employees employeeId;

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public Territories getTerritories() {
        return territories;
    }

    public void setTerritories(Territories territories) {
        this.territories = territories;
    }

    public Employees getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Employees employeeId) {
        this.employeeId = employeeId;
    }
}
