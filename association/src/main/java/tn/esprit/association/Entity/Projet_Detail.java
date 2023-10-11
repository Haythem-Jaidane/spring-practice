package tn.esprit.association.Entity;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Projet_Detail")
public class Projet_Detail implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private String technologie;
    private Long cout_provisoire;
    private Date dateDebut;

    @OneToOne(mappedBy = "projetDetail")
    private T_Projet projet;
}
