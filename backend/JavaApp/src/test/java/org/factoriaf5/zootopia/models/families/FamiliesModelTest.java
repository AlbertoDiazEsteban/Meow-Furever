package org.factoriaf5.zootopia.models.families;

import org.factoriaf5.zootopia.models.animals.Animals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FamiliesModelTest {

    @Test
    public void pruebaFamiliesModel() {
        // Crear una instancia de Families (puedes agregar más atributos si es necesario)
        Families familia = new Families();
        familia.setId(1L);
        familia.setName("Felidae");
        familia.setImgUrl("felidae.jpg");

        // Verificar que los atributos se establecen correctamente
        assertEquals(1L, familia.getId());
        assertEquals("Felidae", familia.getName());
        assertEquals("felidae.jpg", familia.getImgUrl());
    }

    @Test
    public void pruebaFamiliesModelConAnimales() {
        // Crear una instancia de Families con una lista de animales (puedes agregar más atributos si es necesario)
        Families familia = new Families();
        familia.setId(1L);
        familia.setName("Felidae");
        familia.setImgUrl("felidae.jpg");

        Animals animal1 = new Animals();
        animal1.setId(1L);
        animal1.setName("León");
        animal1.setType("Mamífero");
        animal1.setGender("Macho");

        Animals animal2 = new Animals();
        animal2.setId(2L);
        animal2.setName("Tigre");
        animal2.setType("Mamífero");
        animal2.setGender("Hembra");

        familia.getAnimals().add(animal1);
        familia.getAnimals().add(animal2);

        // Verificar que los atributos se establecen correctamente, incluida la lista de animales
        assertEquals(1L, familia.getId());
        assertEquals("Felidae", familia.getName());
        assertEquals("felidae.jpg", familia.getImgUrl());
        assertEquals(2, familia.getAnimals().size());
    }

    @Test
    public void pruebaFamiliesIdGetterSetter() {
        Families familia = new Families();
        familia.setId(1L);
        assertEquals(1L, familia.getId());
    }

    @Test
    public void pruebaFamiliesNombreGetterSetter() {
        Families familia = new Families();
        familia.setName("Felidae");
        assertEquals("Felidae", familia.getName());
    }

    @Test
    public void pruebaFamiliesImgUrlGetterSetter() {
        Families familia = new Families();
        familia.setImgUrl("felidae.jpg");
        assertEquals("felidae.jpg", familia.getImgUrl());
    }

    @Test
    public void pruebaFamiliesAnimalesGetterSetter() {
        Families familia = new Families();

        Animals animal1 = new Animals();
        animal1.setId(1L);
        animal1.setName("León");
        animal1.setType("Mamífero");
        animal1.setGender("Macho");

        Animals animal2 = new Animals();
        animal2.setId(2L);
        animal2.setName("Tigre");
        animal2.setType("Mamífero");
        animal2.setGender("Hembra");

        familia.getAnimals().add(animal1);
        familia.getAnimals().add(animal2);

        assertEquals(2, familia.getAnimals().size());
    }
}