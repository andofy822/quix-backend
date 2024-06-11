package com.quix.app.medecin;

import jakarta.persistence.*;
import java.util.List;
import com.quix.app.etablissement.*;
import com.quix.app.consultation.*;
import com.quix.app.role.*;


@Entity
public class Medecin{
    @Id
    @GeneratedValue(strategy= GenerationValue.IDENTITY)
    private Long id;

    private String nom;
    @OneToOne
    @JoinColumn(name="idRole")
    private Role role;
    
    @ManyToOne
    @JoinColumn(name="idCentre")
    private Etablissement etablissement;
    
    @OneToMany(mappedBy="idMedecin")
    private List<Consultation> consultations;

    
}