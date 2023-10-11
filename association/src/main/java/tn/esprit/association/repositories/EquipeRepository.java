package tn.esprit.association.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.association.Entity.Equipe;
import tn.esprit.association.Entity.T_Projet;

import java.util.List;

@Repository
public interface EquipeRepository extends JpaRepository<Equipe, Long> {

    List<T_Projet> findprojetsByidEquipe(Long idEquipe);
    List<T_Projet> findprojetByidEquipeAndprojetsprojetDetaildescriptionNotNull(Long idEquipe);
    List<T_Projet> findprojetsByidEquipeAndentrepriseid(Long idEquipe,Long idEntreprise);

    List<T_Projet> findprojetsByspecialiteAndadresse(String specialite,String adresse);

}
