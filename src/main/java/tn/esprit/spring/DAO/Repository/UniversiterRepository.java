package tn.esprit.spring.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.DAO.Entities.Universite;

import java.util.List;

public interface UniversiterRepository extends JpaRepository<Universite,Long> {
    //    - Afficher la liste des universités qui ont des étudiants dont leurs noms contiennet la chaine de caractère en paramètre et leurs dates de naissance entre deux dates passées en paramètre
    List<Universite> findUniversitiesByStudentNameAndBirthdateRange();

}
