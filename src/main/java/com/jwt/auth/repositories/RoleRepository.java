package com.jwt.auth.repositories;

import java.util.Optional;

import com.jwt.auth.models.ERole;
import com.jwt.auth.models.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}