package com.example.tp1.Entity;

import lombok.*;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table( name = "Abonnement")
public class Abonnement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAbonnement")
    private Integer idAbonnement; // Clé primaire
    private Long numAbon;
    private Date dateDebut;
    private Date dateFin;
    private Float prixAbon;
    private TypeAbonnement typeAbon;
}
