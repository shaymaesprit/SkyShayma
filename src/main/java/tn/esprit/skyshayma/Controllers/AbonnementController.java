package tn.esprit.skyshayma.Controllers;

import org.springframework.web.bind.annotation.*;
import tn.esprit.skyshayma.entities.Abonnement;
import tn.esprit.skyshayma.entities.TypeAbonnement;
import tn.esprit.skyshayma.services.IAbonementService;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/abonnements")
public class AbonnementController {

    private final IAbonementService abonnementService;

    public AbonnementController(IAbonementService abonnementService) {
        this.abonnementService = abonnementService;
    }

    @GetMapping("/type/{type}")
    public Set<Abonnement> getAbonnementsByType(@PathVariable TypeAbonnement type) {
        return abonnementService.getSubscriptionByType(type);
    }

    @GetMapping("/dates")
    public List<Abonnement> getAbonnementsByDates(@RequestParam("start") String startDate,
                                                  @RequestParam("end") String endDate) {
        LocalDate start = LocalDate.parse(startDate);
        LocalDate end = LocalDate.parse(endDate);
        return abonnementService.retrieveSubscriptionsByDates(start, end);
    }
}