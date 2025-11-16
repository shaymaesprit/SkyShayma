package tn.esprit.skyshayma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.skyshayma.entities.Abonnement;
import tn.esprit.skyshayma.entities.TypeAbonnement;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AbonnementRepository extends JpaRepository<Abonnement, Long> {
    List<Abonnement> findByTypeAboOrderByDateDebut(TypeAbonnement typeAbonnement);
    List<Abonnement> findByDateDebutBetween(LocalDate startDate, LocalDate endDate);
}