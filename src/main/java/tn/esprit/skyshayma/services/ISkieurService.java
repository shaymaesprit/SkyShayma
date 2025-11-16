package tn.esprit.skyshayma.services;

import tn.esprit.skyshayma.entities.Skieur;
import tn.esprit.skyshayma.entities.TypeAbonnement;

import java.util.List;

public interface ISkieurService {
    public List<Skieur> retriveAll();
    public Skieur addSkieur(Skieur skieur);
    public Skieur updateSkieur(Skieur skieur);
    public Skieur retrieveSkieur(Long numSkieur);
    public void deleteSkieur(Long numSkieur);

    Skieur assignSkierToPiste(Long numSkieur, Long numPiste);
    List<Skieur> retrieveSkieursBySubscriptionType(TypeAbonnement typeAbonnement);

}
