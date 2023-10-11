package tn.esprit.association.Entity;


import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "T_Projet")
public class T_Projet implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProjet")
    private Long Id;

    private String Sujet;

    @OneToOne
    private Projet_Detail projetDetail;

    @ManyToMany(mappedBy="projets", cascade = CascadeType.ALL)
    private Set<Equipe> equipes;
}
