package tn.esprit.skyshayma.services;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.skyshayma.entities.Piste;
import tn.esprit.skyshayma.repository.PisteRepository;

import java.util.List;
@Service

public class PisteServiceslmpl implements IPisteService {
    private final PisteRepository pisteRepository;

    public PisteServiceslmpl(PisteRepository pisteRepository) {
        this.pisteRepository = pisteRepository;
    }

    @Override
    public List<Piste> retriveAll() {
        return pisteRepository.findAll();
    }

    @Override
    public Piste addPiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Piste retrievePist(Long numPiste) {
        return pisteRepository.findById(numPiste).orElseThrow();
    }

    @Override
    public void deletePiste(Long numPiste) {
        pisteRepository.deleteById(numPiste);
    }
}