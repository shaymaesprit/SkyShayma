package tn.esprit.skyshayma.services;


import tn.esprit.skyshayma.entities.Piste;

import java.util.List;
public interface IPisteService {
    public List<Piste> retriveAll();
    public Piste addPiste(Piste piste);
    public Piste updatePiste(Piste piste);
    public Piste retrievePist(Long numPiste);
    public void deletePiste(Long numPiste);
}
