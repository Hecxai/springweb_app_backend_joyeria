package com.hecxai.springweb.backend.springweb_app_backend_joyeria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hecxai.springweb.backend.springweb_app_backend_joyeria.models.UserRole;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Long> {

}
