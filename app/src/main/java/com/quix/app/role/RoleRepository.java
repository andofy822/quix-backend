package com.quix.app.role;


import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public class RoleRepository extends JpaRepository<Role, Long>{
    Role findByNom(String nom);
}
