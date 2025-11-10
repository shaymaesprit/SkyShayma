package tn.esprit.skyshayma.Controllers;

import org.springframework.web.bind.annotation.*;
import tn.esprit.skyshayma.entities.Piste;
import tn.esprit.skyshayma.services.IPisteService;

import java.util.List;

@RestController
@RequestMapping("/api/piste")
public class PisteController {

    private final IPisteService pisteService;

    public PisteController(IPisteService pisteService) {
        this.pisteService = pisteService;
    }

    @PostMapping("/add")
    public Piste addPiste(@RequestBody Piste piste) {
        return pisteService.addPiste(piste);
    }

    @PutMapping("/update")
    public Piste updatePiste(@RequestBody Piste piste) {
        return pisteService.updatePiste(piste);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePiste(@PathVariable Long id) {
        pisteService.deletePiste(id);
    }

    @GetMapping("/all")
    public List<Piste> getAllPistes() {
        return pisteService.retriveAll();
    }

    @GetMapping("/{id}")
    public Piste getPiste(@PathVariable Long id) {
        return pisteService.retrievePist(id);
    }
}