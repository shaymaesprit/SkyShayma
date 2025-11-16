package tn.esprit.skyshayma.services;

import org.springframework.stereotype.Service;
import tn.esprit.skyshayma.entities.Abonnement;
import tn.esprit.skyshayma.entities.Cour;
import tn.esprit.skyshayma.entities.TypeAbonnement;
import tn.esprit.skyshayma.repository.AbonnementRepository;
import tn.esprit.skyshayma.repository.CourRepository;
import tn.esprit.skyshayma.services.IAbonementService;
import tn.esprit.skyshayma.services.ICourService;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Service
public class AbonnementServicesImpl implements IAbonementService {
    private AbonnementRepository abonnementRepository;

    public Set<Abonnement> getSubscriptionByType(TypeAbonnement type) {
        return (Set<Abonnement>) abonnementRepository.findByTypeAboOrderByDateDebut(type);
    }
    public List<Abonnement> retrieveSubscriptionsByDates(LocalDate startDate, LocalDate endDate) {
        return abonnementRepository.findByDateDebutBetween(startDate, endDate);
    }
}