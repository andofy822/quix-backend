package com.quix.app.medecin;

import com.quix.app.role;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public class MedecinRepository extends JpaRepository<Medecin,Long>{
    List<Medecin> findByRole(Role role);
}
