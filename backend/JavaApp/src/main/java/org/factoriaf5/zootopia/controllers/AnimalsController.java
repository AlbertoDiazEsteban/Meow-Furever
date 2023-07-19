package org.factoriaf5.zootopia.controllers;

import org.factoriaf5.zootopia.models.animals.Animals;
import org.factoriaf5.zootopia.services.AnimalsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/animals")
public class AnimalsController {
    private final AnimalsService animalsService;

    @Autowired
    public AnimalsController(AnimalsService animalsService) {
        this.animalsService = animalsService;
    }

    @GetMapping
    public ResponseEntity<List<Animals>> getAllAnimals() {
        List<Animals> animals = animalsService.getAllAnimals();
        return ResponseEntity.ok(animals);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Animals> getAnimalById(@PathVariable Long id) {
        Optional<Animals> optionalAnimal = animalsService.getAnimalById(id);
        if (optionalAnimal.isPresent()) {
            Animals animal = optionalAnimal.get();
            return ResponseEntity.ok(animal);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Animals> saveAnimal(@RequestBody Animals animal) {
        Animals savedAnimal = animalsService.saveAnimal(animal);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedAnimal);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Animals> updateAnimalById(@PathVariable Long id, @RequestBody Animals updatedAnimal) {
        Animals animal = animalsService.updateAnimalById(id, updatedAnimal);
        return ResponseEntity.ok(animal);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAnimal(@PathVariable Long id) {
        boolean deleted = animalsService.deleteAnimal(id);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}



