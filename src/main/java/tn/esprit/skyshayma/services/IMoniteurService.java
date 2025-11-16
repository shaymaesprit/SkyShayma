package tn.esprit.skyshayma.services;

import tn.esprit.skyshayma.entities.Moniteur;

import java.util.List;

public interface IMoniteurService {

    public List<Moniteur> retriveAll();

    public Moniteur addMoniteur(Moniteur moniteur);

    public Moniteur updateMoniteur(Moniteur moniteur);

    public Moniteur retrieveMoniteur(Long numMoniteur);

    public void deleteMoniteur(Long numMoniteur);
    Moniteur addInstructorAndAssignToCourse(Moniteur moniteur, Long numCourse);
}
