package tn.esprit.skyshayma.services;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.skyshayma.entities.Cour;
import tn.esprit.skyshayma.repository.CourRepository;

import java.util.List;
@Service
public class CourServicelmpl implements ICourService {
    private final CourRepository courRepository;

    public CourServicelmpl(CourRepository courRepository) {
        this.courRepository = courRepository;
    }


    @Override
    public List<Cour> retriveAll() {
        return courRepository.findAll();
    }

    @Override
    public Cour addCours(Cour cours) {
        return courRepository.save(cours);
    }

    @Override
    public Cour updateCours(Cour cours) {
        return courRepository.save(cours);
    }

    @Override
    public Cour retrieveCours(Long numCours) {
        return courRepository.findById(numCours).orElseThrow();
    }

    @Override
    public void deleteCours(Long numCours) {
        courRepository.deleteById(numCours);
    }
}
