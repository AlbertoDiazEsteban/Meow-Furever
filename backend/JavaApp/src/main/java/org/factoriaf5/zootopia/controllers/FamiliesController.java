package org.factoriaf5.zootopia.controllers;

import org.factoriaf5.zootopia.models.families.Families;
import org.factoriaf5.zootopia.services.FamiliesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/families")
public class FamiliesController {

    @Autowired
    private FamiliesService familiesService;

    @GetMapping
    public List<Families> getAllFamilies() {
        return familiesService.getAllFamilies();
    }

    @PostMapping
    public ResponseEntity<Families> createFamily(@RequestBody Families family) {
        Families createdFamily = familiesService.createFamily(family);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdFamily);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Families> getFamilyById(@PathVariable Long id) {
        Optional<Families> optionalFamily = familiesService.getFamilyById(id);
        return optionalFamily.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Families> updateFamilyById(@PathVariable Long id, @RequestBody Families updatedFamily) {
        try {
            Families updated = familiesService.updateFamily(id, updatedFamily);
            return ResponseEntity.ok(updated);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFamilyById(@PathVariable Long id) {
        familiesService.deleteFamily(id);
        return ResponseEntity.noContent().build();
    }
}