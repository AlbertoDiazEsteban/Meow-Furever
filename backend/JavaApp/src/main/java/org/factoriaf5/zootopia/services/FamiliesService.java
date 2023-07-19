package org.factoriaf5.zootopia.services;

import org.factoriaf5.zootopia.models.families.Families;
import org.factoriaf5.zootopia.repositories.FamiliesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FamiliesService {

    private final FamiliesRepository familiesRepository;

    @Autowired
    public FamiliesService(FamiliesRepository familiesRepository) {
        this.familiesRepository = familiesRepository;
    }

    public List<Families> getAllFamilies() {
        return familiesRepository.findAll();
    }

    public Families createFamily(Families family) {
        return familiesRepository.save(family);
    }

    public Optional<Families> getFamilyById(Long id) {
        return familiesRepository.findById(id);
    }

    public Families updateFamily(Long id, Families updatedFamily) {
        Optional<Families> optionalFamily = familiesRepository.findById(id);
        if (optionalFamily.isPresent()) {
            Families existingFamily = optionalFamily.get();
            existingFamily.setName(updatedFamily.getName());
            return familiesRepository.save(existingFamily);
        } else {
            throw new RuntimeException("Family not found with id: " + id);
        }
    }


    public void deleteFamily(Long id) {
        familiesRepository.deleteById(id);
    }
}

