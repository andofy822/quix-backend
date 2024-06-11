package com.quix.app.etablissement;

import javax.persistence.*;
import java.util.List;

@Entity
public class Etablissement{
    @Id
    @GeneratedValue(strategy= GenerationValue.IDENTITY)
    private Long id;
    private String nom;
    
    @OneToMany(mappedBy="idCentre")
    private List<Medecin> docteurs;
    


}