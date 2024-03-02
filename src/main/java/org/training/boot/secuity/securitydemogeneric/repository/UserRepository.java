package org.training.boot.secuity.securitydemogeneric.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.training.boot.secuity.securitydemogeneric.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsernameOrEmail(String username, String email);
}
