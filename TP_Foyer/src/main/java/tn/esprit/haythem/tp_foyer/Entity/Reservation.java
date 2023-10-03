package tn.esprit.haythem.tp_foyer.Entity;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Reservation")
public class Reservation implements Serializable{
    @Id
    private String idReservation;
    private Date anneeUniversitaire;
    private Boolean estValide;

    @ManyToMany
    private Set<Etudiant> etudiants;
}
