package org.factoriaf5.zootopia.repositories;

import org.factoriaf5.zootopia.models.shelters.Shelters;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SheltersRepository extends JpaRepository<Shelters, Long> {
}

