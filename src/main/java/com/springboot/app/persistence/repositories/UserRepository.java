package com.springboot.app.persistence.repositories;

import com.springboot.app.persistence.entities.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {

    // Forma 1
    Optional<UserEntity> findUserEntityByUsername(String username);

    // Forma 2
    @Query("SELECT u FROM UserEntity u WHERE u.username = ?1")
    Optional<UserEntity> findUser(String username);
}
