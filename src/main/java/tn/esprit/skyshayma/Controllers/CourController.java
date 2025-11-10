package tn.esprit.skyshayma.Controllers;

import org.springframework.web.bind.annotation.*;
import tn.esprit.skyshayma.entities.Cour;
import tn.esprit.skyshayma.services.ICourService;

import java.util.List;

@RestController
@RequestMapping("/api/cours")
public class CourController {

    private final ICourService coursService;

    public CourController(ICourService coursService) {
        this.coursService = coursService;
    }

    @PostMapping("/add")
    public Cour addCours(@RequestBody Cour cours) {
        return coursService.addCours(cours);
    }

    @PutMapping("/update")
    public Cour updateCours(@RequestBody Cour cours) {
        return coursService.updateCours(cours);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCours(@PathVariable Long id) {
        coursService.deleteCours(id);
    }

    @GetMapping("/all")
    public List<Cour> getAllCours() {
        return coursService.retriveAll();
    }

    @GetMapping("/{id}")
    public Cour getCours(@PathVariable Long id) {
        return coursService.retrieveCours(id);
    }
}