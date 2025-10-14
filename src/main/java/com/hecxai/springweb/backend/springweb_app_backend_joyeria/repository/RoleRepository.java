package com.hecxai.springweb.backend.springweb_app_backend_joyeria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hecxai.springweb.backend.springweb_app_backend_joyeria.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
