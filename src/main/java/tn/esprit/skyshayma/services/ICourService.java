package tn.esprit.skyshayma.services;

import tn.esprit.skyshayma.entities.Cour;

import java.util.List;

public interface ICourService {
    public List<Cour> retriveAll();
    public Cour addCours(Cour cours);
    public Cour updateCours(Cour cours);
    public Cour retrieveCours(Long numCours);
    public void deleteCours(Long numCours);
}
