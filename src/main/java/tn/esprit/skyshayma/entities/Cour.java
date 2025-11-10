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
public class Cour {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long numCours;
    private int niveau;
    @Enumerated(EnumType.STRING)
    private TypeCour typeCours;
    @Enumerated(EnumType.STRING)
    private Support support;
    private Float prix;
    private int crenaux;

    @OneToMany( mappedBy="cour")
    private Set<Inscription> Inscription;


}
