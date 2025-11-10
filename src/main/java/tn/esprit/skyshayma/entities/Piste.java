package tn.esprit.skyshayma.entities;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder

public class Piste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numPiste;
    private String nomPiste;
    private int longeur ;
    private int pente;
    @Enumerated(EnumType.STRING)
    private Couleur couleur;
    @ManyToMany
    private Set<Skieur> Skieurs;


}
