package com.hecxai.springweb.backend.springweb_app_backend_joyeria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hecxai.springweb.backend.springweb_app_backend_joyeria.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public User findByEmail(String email);

}
