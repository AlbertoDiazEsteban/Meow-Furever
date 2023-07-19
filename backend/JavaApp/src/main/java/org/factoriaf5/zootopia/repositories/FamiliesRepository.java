package org.factoriaf5.zootopia.repositories;

import org.factoriaf5.zootopia.models.families.Families;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamiliesRepository extends JpaRepository<Families, Long> {
}

