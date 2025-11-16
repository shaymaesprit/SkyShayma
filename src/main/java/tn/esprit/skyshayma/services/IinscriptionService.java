package tn.esprit.skyshayma.services;

import tn.esprit.skyshayma.entities.Inscription;


import java.util.List;

public interface IinscriptionService {
    public List<Inscription> retriveAll();

    public Inscription addInscription(Inscription inscription);

    public Inscription updateInscription(Inscription inscription);

    public  Inscription retrieveInscription(Long numInscription);

    public void deleteInscription(Long numInscription);
    Inscription addInscriptionAndAssignToSkier(Inscription inscription, Long numSkier);
    Inscription assignInscriptionToCourse(Long numInscription, Long numCourse);
    Inscription addInscriptionAndAssignToSkierAndCourse(Inscription inscription, Long numSkieur, Long numCours);
}
