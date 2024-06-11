package com.quix.app.consultation;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDateTime;
import java.util.List;
public interface ConsultationRepository extends JpaRepository<Consultation, Long>{
    List<Consultation> findByDocteurIdAndDateHeureBetween(Long docteurId,LocalDateTime debut,LocalDateTime fin);
}