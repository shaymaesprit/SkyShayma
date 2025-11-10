package tn.esprit.skyshayma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.skyshayma.entities.Cour;

@Repository
public interface CourRepository extends JpaRepository<Cour, Long> {
}