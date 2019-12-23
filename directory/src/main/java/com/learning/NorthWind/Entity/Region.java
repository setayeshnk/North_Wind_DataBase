package com.learning.NorthWind.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Region",schema = "public")
public class Region {
    @OneToMany
    private List<Territories> territoriesList=new ArrayList();
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int regionId;

    @Column(name = "Region_Description",nullable = false)
    private String regionDescription;

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    public String getRegionDescription() {
        return regionDescription;
    }

    public void setRegionDescription(String regionDescription) {
        this.regionDescription = regionDescription;
    }

    public List<Territories> getTerritoriesList() {
        return territoriesList;
    }

    public void setTerritoriesList(List<Territories> territoriesList) {
        this.territoriesList = territoriesList;
    }

}
