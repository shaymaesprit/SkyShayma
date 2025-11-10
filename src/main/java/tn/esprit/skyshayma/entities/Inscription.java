package tn.esprit.skyshayma.entities;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder

public class Inscription {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int numInscription;
    private int numSemaine;
    @ManyToOne
    private Skieur skieur;
    @ManyToOne
    private Cour cour;



}
