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
@Table( name = "Moniteur")
public class Moniteur implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMoniteur")
    private Integer idMoniteur;
    private Long numMoniteur;
    private String nomM;
    private String prenomM;
    private Date dateRecru;
}
