package tn.esprit.association.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.association.Entity.T_Projet;

import java.util.List;

@Repository
public interface ProjetRepository extends JpaRepository<T_Projet, Long> {

    List<T_Projet> findprojetByprojetDetailtechnologieLike(String technologie);

}
