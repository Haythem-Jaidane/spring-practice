package com.example.tp1.Entity;

import lombok.*;
import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table( name = "Inscription")
public class Inscription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idInscription")
    private Integer idInscription; // Clé primaire
    private Long numInscription;
    private Integer numSemaine;
}
