package tn.esprit.skyshayma.services;

import org.springframework.stereotype.Service;
import tn.esprit.skyshayma.entities.Cour;
import tn.esprit.skyshayma.entities.Moniteur;
import tn.esprit.skyshayma.repository.CourRepository;
import tn.esprit.skyshayma.repository.MoniteurRepository;
import tn.esprit.skyshayma.services.IMoniteurService;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Service
public class MoniteurServiceslmpl implements IMoniteurService {
    private final MoniteurRepository moniteurRepository;
    private final CourRepository coursRepo;

    public MoniteurServiceslmpl(MoniteurRepository moniteurRepository, CourRepository coursRepo) {
        this.moniteurRepository = moniteurRepository;
        this.coursRepo = coursRepo;
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

    @Override
    public Moniteur addInstructorAndAssignToCourse(Moniteur moniteur, Long numCourse) {
        Cour cours = coursRepo.findById(numCourse).get();
        Set<Cour> courses = new HashSet<>();
        courses.add(cours);
        moniteur.setCour(courses);
        return MoniteurRepository.save(moniteur);
    }
}