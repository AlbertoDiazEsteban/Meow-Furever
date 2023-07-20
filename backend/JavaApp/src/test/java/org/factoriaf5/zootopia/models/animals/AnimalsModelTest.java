package org.factoriaf5.zootopia.models.animals;
import org.factoriaf5.zootopia.models.families.Families;
import org.factoriaf5.zootopia.models.continents.Continents;
import org.factoriaf5.zootopia.models.shelters.Shelters;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AnimalsModelTest {

    private Animals animals;

    @BeforeEach
    public void setUp() {
        animals = new Animals();
    }

    @Test
    public void testGetAndSetId() {
        animals.setId(1L);
        assertEquals(1L, animals.getId());
    }

    @Test
    public void testGetAndSetName() {
        animals.setName("Lion");
        assertEquals("Lion", animals.getName());
    }

    @Test
    public void testGetAndSetType() {
        animals.setType("Mammal");
        assertEquals("Mammal", animals.getType());
    }

    @Test
    public void testGetAndSetGender() {
        animals.setGender("Male");
        assertEquals("Male", animals.getGender());
    }

    @Test
    public void testGetAndSetFamily() {
        Families family = new Families();
        animals.setFamily(family);
        assertEquals(family, animals.getFamily());
    }

    @Test
    public void testGetAndSetContinent() {
        Continents continent = new Continents();
        animals.setContinent(continent);
        assertEquals(continent, animals.getContinent());
    }

    @Test
    public void testGetAndSetShelter() {
        Shelters shelter = new Shelters();
        animals.setShelter(shelter);
        assertEquals(shelter, animals.getShelter());
    }

    @Test
    public void testGetAndSetDate() {
        java.sql.Date date = java.sql.Date.valueOf("2023-07-20");
        animals.setDate(date);
        assertEquals(date, animals.getDate());
    }

    @Test
    public void testGetAndSetImgUrl() {
        animals.setImgUrl("https://example.com/lion.jpg");
        assertEquals("https://example.com/lion.jpg", animals.getImgUrl());
    }

    @Test
    public void testAnimalsModel() {
        Animals animal = new Animals();
        animal.setId(1L);
        animal.setName("Lion");
        animal.setType("Mammal");
        animal.setGender("Male");

        assertEquals(1L, animal.getId());
        assertEquals("Lion", animal.getName());
        assertEquals("Mammal", animal.getType());
        assertEquals("Male", animal.getGender());
    }

}