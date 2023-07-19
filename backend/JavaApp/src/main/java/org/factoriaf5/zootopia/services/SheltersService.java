package org.factoriaf5.zootopia.services;

import org.factoriaf5.zootopia.models.shelters.Shelters;
import org.factoriaf5.zootopia.repositories.SheltersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SheltersService {

    private final SheltersRepository sheltersRepository;

    @Autowired
    public SheltersService(SheltersRepository sheltersRepository) {
        this.sheltersRepository = sheltersRepository;
    }

    public List<Shelters> getAllShelters() {
        return sheltersRepository.findAll();
    }

    public Shelters createShelter(Shelters shelter) {
        return sheltersRepository.save(shelter);
    }

    public Optional<Shelters> getShelterById(Long id) {
        return sheltersRepository.findById(id);
    }

    public Shelters updateShelter(Long id, Shelters updatedShelter) {
        Optional<Shelters> optionalShelter = sheltersRepository.findById(id);
        if (optionalShelter.isPresent()) {
            Shelters existingShelter = optionalShelter.get();
            existingShelter.setName(updatedShelter.getName());
            return sheltersRepository.save(existingShelter);
        } else {
            throw new RuntimeException("Shelter not found with id: " + id);
        }
    }

    public void deleteShelter(Long id) {
        sheltersRepository.deleteById(id);
    }
}