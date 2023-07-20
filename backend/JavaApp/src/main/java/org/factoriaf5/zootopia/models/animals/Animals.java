package org.factoriaf5.zootopia.models.animals;
import org.factoriaf5.zootopia.models.families.Families;
import org.factoriaf5.zootopia.models.continents.Continents;
import org.factoriaf5.zootopia.models.shelters.Shelters;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.persistence.*;

@Entity
@Table(name = "animals")
public class Animals {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "gender")
    private String gender;

    @ManyToOne
    @JoinColumn(name = "families_id")
    private Families family;

    @ManyToOne
    @JoinColumn(name = "continents_id")
    private Continents continent;

    @ManyToOne
    @JoinColumn(name = "shelter_id")
    private Shelters shelter;

    @Column(name = "date")
    private java.sql.Date date;

    @Column(name = "img_url")
    private String imgUrl;



    public Shelters getShelter() {
        return shelter;
    }

    public void setShelter(Shelters shelter) {
        this.shelter = shelter;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Families getFamily() {
        return family;
    }

    public void setFamily(Families family) {
        this.family = family;
    }

    public Continents getContinent() {
        return continent;
    }

    public void setContinent(Continents continent) {
        this.continent = continent;
    }

    public java.sql.Date getDate() {
        return date;
    }

    public void setDate(java.sql.Date date) {
        this.date = date;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }


}



