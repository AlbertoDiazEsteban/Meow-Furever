package org.factoriaf5.zootopia.models.continents;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContinentsModelTest {

    private Continents continents;

    @BeforeEach
    public void setUp() {
        continents = new Continents();
    }

    @Test
    public void testGetAndSetId() {
        continents.setId(1L);
        assertEquals(1L, continents.getId());
    }

    @Test
    public void testGetAndSetName() {
        continents.setName("Africa");
        assertEquals("Africa", continents.getName());
    }

    @Test
    public void testGetAndSetImgUrl() {
        continents.setImgUrl("https://example.com/africa.jpg");
        assertEquals("https://example.com/africa.jpg", continents.getImgUrl());
    }

}