package com.quix.app.medecin;


import com.quix.app.consultation;
import com.quix.app.role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class MedecinService {
    @Autowired
    private MedecinRepository medecinRepository;

    @Autowired
    private ConsultationRepository consultationRepository;

    @Autowired
    private RoleRepository roleRepository;

    public List<Medecin> listerDocteursDispo(String type,LocalDateTime deb,LocalDateTime fin){
        Role role=roleRepository.findByNom(type);
        if(role == null){
            return List.of();
        }
        List<Medecin> docteurs = medecinRepository.findByRole(role);
        if(docteurs.isEmpty()){
            return medecinRepository.findAll().stream().filter(medecin -> estDisponible(medecin,deb,fin)).collect(Collectors.toList());
        }
        else{
            return docteurs.stream().filter(medecin -> estDisponible(medecin,deb,fin)).collect(Collectors.toList());
 
        }
    }

    private boolean estDisponible(Medecin medecin,LocalDateTime debut,LocalDateTime fin){
        List<Consultation> consultations=consultationRepository.findByDocteurIdAndDateHeureBetween(medecin.getId(),debut,fin);
        return consultations.isEmpty();
    }
}