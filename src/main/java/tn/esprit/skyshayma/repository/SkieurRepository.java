package tn.esprit.skyshayma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.skyshayma.entities.Skieur;

@Repository
public interface SkieurRepository extends JpaRepository<Skieur, Long> {
}
