package com.example.tp1.Entity;

import lombok.*;
import jakarta.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table( name = "Skieur")
public class Skieur implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSkieur")
    private Integer idSkieur; // Clé primaire
    private String nomSkieur;
    private String prenomSkieur;
    @Temporal (TemporalType.DATE)
    private Date dateNaissance;
    private String ville;
}
