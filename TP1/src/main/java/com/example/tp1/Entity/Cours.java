package com.example.tp1.Entity;


import lombok.*;
import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table( name = "Cours")
public class Cours implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCours")
    private Integer idCours; // Clé primaire
    private Long numCours;
    private Integer niveau;
    private TypeCours typeCours;
    private Support support;
    private Float prix;
    private Integer creneau;
}