package tn.esprit.skyshayma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.skyshayma.entities.Piste;

@Repository
public interface PisteRepository extends JpaRepository<Piste, Long> {
}
