package tn.esprit.skyshayma.Controllers;

import org.springframework.web.bind.annotation.*;
import tn.esprit.skyshayma.entities.Skieur;
import tn.esprit.skyshayma.services.ISkieurService;

import java.util.List;

@RestController
@RequestMapping("/api/skieur")
public class SkieurController {

    private final ISkieurService skieurService;

    public SkieurController(ISkieurService skieurService) {
        this.skieurService = skieurService;
    }

    @PostMapping("/add")
    public Skieur addSkieur(@RequestBody Skieur skieur) {
        System.out.println("Received skieur: " + skieur);
        return skieurService.addSkieur(skieur);
    }

    @PutMapping("/update")
    public Skieur updateSkieur(@RequestBody Skieur skieur) {
        return skieurService.updateSkieur(skieur);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteSkieur(@PathVariable Long id) {
        skieurService.deleteSkieur(id);
    }

    @GetMapping("/all")
    public List<Skieur> getAllSkieurs() {
        return skieurService.retriveAll();
    }

    @GetMapping("/{id}")
    public Skieur getSkieur(@PathVariable Long id) {
        return skieurService.retrieveSkieur(id);
    }
}