package tn.esprit.skyshayma.Controllers;

import org.springframework.web.bind.annotation.*;
import tn.esprit.skyshayma.entities.Moniteur;
import tn.esprit.skyshayma.services.IMoniteurService;

import java.util.List;

@RestController
@RequestMapping("/api/moniteur")
public class MoniteurController {

    private final IMoniteurService moniteurService;

    public MoniteurController(IMoniteurService moniteurService) {
        this.moniteurService = moniteurService;
    }

    @PostMapping("/add")
    public Moniteur addMoniteur(@RequestBody Moniteur moniteur) {
        return moniteurService.addMoniteur(moniteur);
    }

    @PutMapping("/update")
    public Moniteur updateMoniteur(@RequestBody Moniteur moniteur) {
        return moniteurService.updateMoniteur(moniteur);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteMoniteur(@PathVariable Long id) {
        moniteurService.deleteMoniteur(id);
    }

    @GetMapping("/all")
    public List<Moniteur> getAllMoniteurs() {
        return moniteurService.retriveAll();
    }

    @GetMapping("/{id}")
    public Moniteur getMoniteur(@PathVariable Long id) {
        return moniteurService.retrieveMoniteur(id);
    }
}