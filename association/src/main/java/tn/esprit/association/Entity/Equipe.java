package tn.esprit.association.Entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.Set;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Equipe")
public class Equipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String specialite;

    @ManyToOne(cascade = CascadeType.ALL)
    Entreprise entreprise;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<T_Projet> projets;
}
