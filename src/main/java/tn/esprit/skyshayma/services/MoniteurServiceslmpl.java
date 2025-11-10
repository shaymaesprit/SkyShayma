package tn.esprit.skyshayma.services;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.skyshayma.entities.Moniteur;
import tn.esprit.skyshayma.repository.MoniteurRepository;

import java.util.List;


@Service
public class MoniteurServiceslmpl implements IMoniteurService {
    private final MoniteurRepository moniteurRepository;

    public MoniteurServiceslmpl(MoniteurRepository moniteurRepository) {
        this.moniteurRepository = moniteurRepository;
    }

    @Override
    public List<Moniteur> retriveAll() {
        return moniteurRepository.findAll();
    }

    @Override
    public Moniteur addMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }

    @Override
    public Moniteur updateMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }

    @Override
    public Moniteur retrieveMoniteur(Long numMoniteur) {
        return moniteurRepository.findById(numMoniteur).orElseThrow();
    }

    @Override
    public void deleteMoniteur(Long numMoniteur) {
        moniteurRepository.deleteById(numMoniteur);
    }
}