package com.quix.app.consultation;

import jakarta.persistence.Entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Consultation{
    @Id
    @GeneratedValue(strategy= GenerationValue.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name="idMedecin")
    private Medecin docteur;
    
    private LocalDateTime dateHeure;

}