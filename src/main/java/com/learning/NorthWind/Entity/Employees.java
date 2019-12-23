package com.learning.NorthWind.Entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Employees",schema = "public")
public class Employees {
    @OneToMany
    private List<EmployeeTerritories> employeeTerritoriesList=new ArrayList();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId;
    @Column(name = "Last_Name",nullable = false)
    private String lastName;
    @Column(name = "First_Name",nullable = false)
    private String firstName;
    @Column(name = "Title")
    private String title;
    @Column(name = "Title_Of_Courtesy")
    private String titleOfCourtesy;
    @Column(name = "Birth_Date")
    private Timestamp birthDate;
    @Column(name = "Hire_Date")
    private Timestamp hireDate;
    @Column(name = "Address")
    private String address;
    @Column(name = "City")
    private String city;
    @Column(name = "Region")
    private String region;
    @Column(name = "Postal_Code")
    private String postalCode;
    @Column(name = "Country")
    private String country;
    @Column(name = "Home_Phone")
    private String homePhone;
    @Column(name = "Extension")
    private String extension;
    @Column(name = "Photo")
    private byte[] photo;

    @Column(name = "Notes")
    private String notes;
    @Column(name = "Reports_To")
    private int reportsTo;
    @Column(name = "Photo_Path")
    private String photoPath;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getReportsTo() {
        return reportsTo;
    }

    public void setReportsTo(int reportsTo) {
        this.reportsTo = reportsTo;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    public String getTitleOfCourtesy() {
        return titleOfCourtesy;
    }

    public void setTitleOfCourtesy(String titleOfCourtesy) {
        this.titleOfCourtesy = titleOfCourtesy;
    }

    public Timestamp getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Timestamp birthDate) {
        this.birthDate = birthDate;
    }

    public Timestamp getHireDate() {
        return hireDate;
    }

    public void setHireDate(Timestamp hireDate) {
        this.hireDate = hireDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public List<EmployeeTerritories> getEmployeeTerritoriesList() {
        return employeeTerritoriesList;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public void setEmployeeTerritoriesList(List<EmployeeTerritories> employeeTerritoriesList) {
        this.employeeTerritoriesList = employeeTerritoriesList;


    }
}
