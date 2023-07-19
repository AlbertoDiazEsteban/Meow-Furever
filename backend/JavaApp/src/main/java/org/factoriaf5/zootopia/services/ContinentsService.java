package org.factoriaf5.zootopia.services;

import org.factoriaf5.zootopia.models.continents.Continents;
import org.factoriaf5.zootopia.repositories.ContinentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContinentsService {

    private final ContinentsRepository continentsRepository;

    @Autowired
    public ContinentsService(ContinentsRepository continentsRepository) {
        this.continentsRepository = continentsRepository;
    }

    public List<Continents> getAllContinents() {
        return continentsRepository.findAll();
    }

    public Continents getContinentById(Long id) {
        return continentsRepository.findById(id).orElse(null);
    }

    public Continents addContinent(Continents continent) {
        return continentsRepository.save(continent);
    }

    public Continents updateContinent(Long id, Continents continent) {
        Continents existingContinent = continentsRepository.findById(id).orElse(null);
        if (existingContinent != null) {
            existingContinent.setName(continent.getName());
            existingContinent.setImgUrl(continent.getImgUrl());
            return continentsRepository.save(existingContinent);
        }
        return null;
    }

    public void deleteContinent(Long id) {
        continentsRepository.deleteById(id);
    }
}




