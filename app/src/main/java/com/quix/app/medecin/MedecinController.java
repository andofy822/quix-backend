package com.quix.app.medecin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;


@RestController
@RequestMapping("/api/docteurs")
public class MedecinController {
    @Autowired
    private MedecinService medecinService;

    @GetMapping
    private List<Medecin> getMedecinDispo(@RequestParam String type,@RequestParam LocalDateTime debut,@RequestParam LocalDateTime fin){
        return medecinService.listerDocteursDispo(type,debut,fin);
    }

}