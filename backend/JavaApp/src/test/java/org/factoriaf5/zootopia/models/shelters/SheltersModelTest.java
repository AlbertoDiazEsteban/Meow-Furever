package org.factoriaf5.zootopia.models.shelters;

import org.factoriaf5.zootopia.models.animals.Animals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SheltersModelTest {

    @Test
    public void testSheltersModel() {

        Shelters shelter = new Shelters();
        shelter.setId(1L);
        shelter.setName("Refugio de Animales");
        shelter.setImgUrl("refugio.jpg");

        // Verificar que los atributos se establecen correctamente
        assertEquals(1L, shelter.getId());
        assertEquals("Refugio de Animales", shelter.getName());
        assertEquals("refugio.jpg", shelter.getImgUrl());
    }

    @Test
    public void testSheltersModelWithAnimals() {

        Shelters shelter = new Shelters();
        shelter.setId(1L);
        shelter.setName("Refugio de Animales");
        shelter.setImgUrl("refugio.jpg");

        Animals animal1 = new Animals();
        animal1.setId(1L);
        animal1.setName("Perro");
        animal1.setType("Mamífero");
        animal1.setGender("Macho");

        Animals animal2 = new Animals();
        animal2.setId(2L);
        animal2.setName("Gato");
        animal2.setType("Mamífero");
        animal2.setGender("Hembra");

        shelter.getAnimals().add(animal1);
        shelter.getAnimals().add(animal2);

        assertEquals(1L, shelter.getId());
        assertEquals("Refugio de Animales", shelter.getName());
        assertEquals("refugio.jpg", shelter.getImgUrl());
        assertEquals(2, shelter.getAnimals().size());
    }

    @Test
    public void testSheltersIdGetterSetter() {
        Shelters shelter = new Shelters();
        shelter.setId(1L);
        assertEquals(1L, shelter.getId());
    }

    @Test
    public void testSheltersNameGetterSetter() {
        Shelters shelter = new Shelters();
        shelter.setName("Refugio de Animales");
        assertEquals("Refugio de Animales", shelter.getName());
    }

    @Test
    public void testSheltersImgUrlGetterSetter() {
        Shelters shelter = new Shelters();
        shelter.setImgUrl("refugio.jpg");
        assertEquals("refugio.jpg", shelter.getImgUrl());
    }

    @Test
    public void testSheltersAnimalsGetterSetter() {
        Shelters shelter = new Shelters();

        Animals animal1 = new Animals();
        animal1.setId(1L);
        animal1.setName("Perro");
        animal1.setType("Mamífero");
        animal1.setGender("Macho");

        Animals animal2 = new Animals();
        animal2.setId(2L);
        animal2.setName("Gato");
        animal2.setType("Mamífero");
        animal2.setGender("Hembra");

        shelter.getAnimals().add(animal1);
        shelter.getAnimals().add(animal2);

        assertEquals(2, shelter.getAnimals().size());
    }
}
