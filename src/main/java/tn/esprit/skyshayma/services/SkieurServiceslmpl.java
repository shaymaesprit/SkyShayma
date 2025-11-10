package tn.esprit.skyshayma.services;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.skyshayma.entities.Skieur;
import tn.esprit.skyshayma.repository.SkieurRepository;

import java.util.List;

@Service
public class SkieurServiceslmpl implements ISkieurService {
    private final SkieurRepository skieurRepository;

    public SkieurServiceslmpl(SkieurRepository skieurRepository) {
        this.skieurRepository = skieurRepository;
    }

    @Override
    public List<Skieur> retriveAll() {
        return skieurRepository.findAll();
    }

    @Override
    public Skieur addSkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }

    @Override
    public Skieur updateSkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }

    @Override
    public Skieur retrieveSkieur(Long numSkieur) {
        return skieurRepository.findById(numSkieur).orElseThrow();
    }

    @Override
    public void deleteSkieur(Long numSkieur) {
        skieurRepository.deleteById(numSkieur);
    }
}
