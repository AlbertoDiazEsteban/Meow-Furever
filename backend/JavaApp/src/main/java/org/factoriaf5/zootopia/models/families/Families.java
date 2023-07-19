package org.factoriaf5.zootopia.models.families;
import java.util.ArrayList;
import java.util.List;
import org.factoriaf5.zootopia.models.animals.Animals;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.databind.ObjectMapper;


import jakarta.persistence.*;

@Entity
@Table(name = "families")
public class Families {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String imgUrl;

    @OneToMany(mappedBy = "family")
    @JsonBackReference
    private List<Animals> animals = new ArrayList<>();

    public Families() {
    }

    public Families(Long id, String name, String imgUrl) {
        this.id = id;
        this.name = name;
        this.imgUrl = imgUrl;
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

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public List<Animals> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animals> animals) {
        this.animals = animals;
    }
}
