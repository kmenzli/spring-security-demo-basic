package org.training.boot.secuity.securitydemogeneric.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.training.boot.secuity.securitydemogeneric.entity.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(String name);
}
