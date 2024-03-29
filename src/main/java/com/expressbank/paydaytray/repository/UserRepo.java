package com.expressbank.paydaytray.repository;

import com.expressbank.paydaytray.auth.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Optional<User> findUserByEmailOrUsername(String email, String username);
}
