package org.factoriaf5.zootopia.services;

import org.factoriaf5.zootopia.models.animals.Animals;
import org.factoriaf5.zootopia.repositories.AnimalsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalsService {
    private final AnimalsRepository animalsRepository;

    @Autowired
    public AnimalsService(AnimalsRepository animalsRepository) {
        this.animalsRepository = animalsRepository;
    }

    public List<Animals> getAllAnimals() {
        return animalsRepository.findAll();
    }

    public Optional<Animals> getAnimalById(Long id) {
        return animalsRepository.findById(id);
    }

    public Animals saveAnimal(Animals animal) {
        return animalsRepository.save(animal);
    }

    public Animals updateAnimalById(Long id, Animals updatedAnimal) {
        Optional<Animals> optionalAnimal = animalsRepository.findById(id);
        if (optionalAnimal.isPresent()) {
            Animals existingAnimal = optionalAnimal.get();
            existingAnimal.setName(updatedAnimal.getName());
            existingAnimal.setType(updatedAnimal.getType());
            existingAnimal.setGender(updatedAnimal.getGender());
            existingAnimal.setFamily(updatedAnimal.getFamily());
            existingAnimal.setContinent(updatedAnimal.getContinent());
            existingAnimal.setDate(updatedAnimal.getDate());
            existingAnimal.setImgUrl(updatedAnimal.getImgUrl());
            return animalsRepository.save(existingAnimal);
        } else {
            throw new RuntimeException("Animal not found with id: " + id);
        }
    }

    public boolean deleteAnimal(Long id) {
        if (animalsRepository.existsById(id)) {
            animalsRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}



