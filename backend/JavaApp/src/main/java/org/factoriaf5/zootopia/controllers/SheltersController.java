package org.factoriaf5.zootopia.controllers;

import org.factoriaf5.zootopia.models.shelters.Shelters;
import org.factoriaf5.zootopia.services.SheltersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/shelters")
public class SheltersController {

    @Autowired
    private SheltersService sheltersService;

    @GetMapping
    public List<Shelters> getAllShelters() {
        return sheltersService.getAllShelters();
    }

    @PostMapping
    public ResponseEntity<Shelters> createShelter(@RequestBody Shelters shelter) {
        Shelters createdShelter = sheltersService.createShelter(shelter);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdShelter);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Shelters> getShelterById(@PathVariable Long id) {
        Optional<Shelters> optionalShelter = sheltersService.getShelterById(id);
        return optionalShelter.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Shelters> updateShelterById(@PathVariable Long id, @RequestBody Shelters updatedShelter) {
        try {
            Shelters updated = sheltersService.updateShelter(id, updatedShelter);
            return ResponseEntity.ok(updated);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteShelterById(@PathVariable Long id) {
        sheltersService.deleteShelter(id);
        return ResponseEntity.noContent().build();
    }
}
