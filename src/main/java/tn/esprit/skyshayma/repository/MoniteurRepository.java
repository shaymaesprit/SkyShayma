package tn.esprit.skyshayma.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.skyshayma.entities.Moniteur;

@Repository
public interface MoniteurRepository extends JpaRepository<Moniteur, Long> {

}
