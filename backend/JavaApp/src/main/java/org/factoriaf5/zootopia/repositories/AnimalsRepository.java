package org.factoriaf5.zootopia.repositories;

import org.factoriaf5.zootopia.models.animals.Animals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalsRepository extends JpaRepository<Animals, Long> {
}

