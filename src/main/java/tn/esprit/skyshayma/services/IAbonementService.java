package tn.esprit.skyshayma.services;

import tn.esprit.skyshayma.entities.Abonnement;
import tn.esprit.skyshayma.entities.Cour;
import tn.esprit.skyshayma.entities.TypeAbonnement;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface IAbonementService {
    public List<Abonnement> retriveAll();
    public Abonnement addAbonnement(Abonnement abonnemnt);
    public Abonnement updateAbonnement(Abonnement abonnemnt);
    public Abonnement retrieveAbonnement(Long numAbonnement);
    public void deleteAbonnement(Long numAbonnement);
    Set<Abonnement> getSubscriptionByType(TypeAbonnement type);
    List<Abonnement> retrieveSubscriptionsByDates(LocalDate startDate, LocalDate endDate);
}
