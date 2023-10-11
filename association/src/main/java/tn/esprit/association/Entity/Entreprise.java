package tn.esprit.association.Entity;

import java.io.Serializable;
import java.util.Set;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Entreprise")
public class Entreprise implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    private String adresse;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="entreprise")
    private Set<Equipe> Equipes;

}
