package org.factoriaf5.zootopia.repositories;


import org.factoriaf5.zootopia.models.users.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
}

