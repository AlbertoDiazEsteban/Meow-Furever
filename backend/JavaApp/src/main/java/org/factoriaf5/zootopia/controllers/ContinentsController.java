package org.factoriaf5.zootopia.controllers;

import org.factoriaf5.zootopia.models.continents.Continents;
import org.factoriaf5.zootopia.services.ContinentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/continents")
public class ContinentsController {

    private final ContinentsService continentsService;

    @Autowired
    public ContinentsController(ContinentsService continentsService) {
        this.continentsService = continentsService;
    }

    @GetMapping
    public List<Continents> getAllContinents() {
        return continentsService.getAllContinents();
    }

    @GetMapping("/{id}")
    public Continents getContinentById(@PathVariable Long id) {
        return continentsService.getContinentById(id);
    }

    @PostMapping
    public Continents addContinent(@RequestBody Continents continent) {
        return continentsService.addContinent(continent);
    }

    @PutMapping("/{id}")
    public Continents updateContinent(@PathVariable Long id, @RequestBody Continents continent) {
        return continentsService.updateContinent(id, continent);
    }

    @DeleteMapping("/{id}")
    public void deleteContinent(@PathVariable Long id) {
        continentsService.deleteContinent(id);
    }
}




