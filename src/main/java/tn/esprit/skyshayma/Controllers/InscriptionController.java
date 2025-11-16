package tn.esprit.skyshayma.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.skyshayma.services.IinscriptionService;
import tn.esprit.skyshayma.entities.Inscription;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/cours")
public class InscriptionController {

    private final IinscriptionService InscriptionServiceImpl;

    @PostMapping("/addInscription")
    public Inscription addInscription(@RequestBody Inscription inscription) {
        return InscriptionServiceImpl.addInscription(inscription);
    }

    @PutMapping("/updateInscription")
    public Inscription updateInscription(@RequestBody Inscription  inscription) {
        return InscriptionServiceImpl.updateInscription(inscription);
    }

    @GetMapping("/retrieveInscription/{id}")
    public Inscription retrieveInscription(@PathVariable long id) {
        return InscriptionServiceImpl.retrieveInscription(id);
    }

    @GetMapping("/{id}")
    public Inscription retrieveInscription(@PathVariable Long id) {
        Inscription retrieveInscription(Long numInscription);
    }
}