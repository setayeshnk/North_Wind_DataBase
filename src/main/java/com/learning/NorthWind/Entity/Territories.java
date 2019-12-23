package com.learning.NorthWind.Entity;

import javax.persistence.*;

@Entity
@Table(name = "Territories",schema = "public")
public class Territories {

    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String TerritoryId;
    @Column(name = "Territory_Description",nullable = false)
    private String territoryDescription;

    @ManyToOne(targetEntity = Region.class , cascade = CascadeType.ALL)
    @JoinColumn(name = "Region_Id")
    private Region regionId;

    public String getTerritoryId() {
        return TerritoryId;
    }

    public void setTerritoryId(String territoryId) {
        TerritoryId = territoryId;
    }

    public String getTerritoryDescription() {
        return territoryDescription;
    }




    public void setTerritoryDescription(String territoryDescription) {
        this.territoryDescription = territoryDescription;

    }

    public Region getRegionId() {
        return regionId;
    }

    public void setRegionId(Region regionId) {
        this.regionId = regionId;
    }
}
