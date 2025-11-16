package tn.esprit.skyshayma.services;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.skyshayma.entities.Piste;
import tn.esprit.skyshayma.entities.Skieur;
import tn.esprit.skyshayma.entities.TypeAbonnement;
import tn.esprit.skyshayma.repository.CourRepository;
import tn.esprit.skyshayma.repository.PisteRepository;
import tn.esprit.skyshayma.repository.SkieurRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class SkieurServiceslmpl implements ISkieurService {
    private final SkieurRepository skieurRepository;
    private final PisteRepository pisteRepo;
    private final CourRepository coursRepo;

    public SkieurServiceslmpl(SkieurRepository skieurRepository, PisteRepository pisteRepo, CourRepository coursRepo) {
        this.skieurRepository = skieurRepository;
        this.pisteRepo = pisteRepo;
        this.coursRepo = coursRepo;
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

    @Override
    public Skieur assignSkierToPiste(Long numSkieur, Long numPiste) {
        Skieur GetSkieur = skieurRepository.findById(numSkieur).get();
        Piste GetPiste = pisteRepo.findById(numPiste).get();
        Set<Piste> pistes = new HashSet<>();
        if(GetSkieur.getPistes() != null){
            pistes = GetSkieur.getPistes();
        }
        pistes.add(GetPiste);
        GetSkieur.setPistes(pistes);
        return skieurRepository.save(GetSkieur);
    }

    @Override
    public List<Skieur> retrieveSkieursBySubscriptionType(TypeAbonnement typeAbonnement) {
        return skieurRepository.findSkiersByTypeAbonnement(typeAbonnement);
    }
}
