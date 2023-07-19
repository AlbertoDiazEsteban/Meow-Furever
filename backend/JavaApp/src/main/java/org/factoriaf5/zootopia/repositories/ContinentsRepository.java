package org.factoriaf5.zootopia.repositories;

import org.factoriaf5.zootopia.models.continents.Continents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContinentsRepository extends JpaRepository<Continents, Long> {
}



