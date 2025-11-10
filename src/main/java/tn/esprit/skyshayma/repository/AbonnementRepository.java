package tn.esprit.skyshayma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.skyshayma.entities.Abonnement;

@Repository
public interface AbonnementRepository extends JpaRepository<Abonnement, Long> {
}
