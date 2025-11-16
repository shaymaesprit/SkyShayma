package tn.esprit.skyshayma.services;

import org.springframework.stereotype.Service;
import tn.esprit.skyshayma.entities.Cour;
import tn.esprit.skyshayma.entities.Piste;
import tn.esprit.skyshayma.repository.CourRepository;
import tn.esprit.skyshayma.repository.PisteRepository;
import tn.esprit.skyshayma.services.ICourService;
import tn.esprit.skyshayma.services.IPisteService;

import java.util.List;

public class CourServiceImpl implements ICourService {
    private CourRepository coursRepository;

    @Override
    public List<Cour> retriveAll() {
        return coursRepository.findAll();
    }

    @Override
    public Cour addCours(Cour cours) {
        return coursRepository.save(cours);
    }

    @Override
    public Cour updateCours(Cour cours) {
        return coursRepository.save(cours);
    }

    @Override
    public Cour retrieveCours(Long numCours) {
        return coursRepository.findById(numCours).orElseThrow();
    }

    @Override
    public void deleteCours(Long numCours) {
        coursRepository.deleteById(numCours);
    }
}

