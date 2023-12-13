package tn.esprit.spring.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.DAO.Entities.Etudiant;

import java.time.LocalDate;
import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
    //SELECT * FROM Etudiant where cin = ...
    Etudiant findByCin(long cin);

    // SELECT * FROM Etudiant WHERE nomEt like ...
    List<Etudiant> findByNomEtLike(String nomEt);
    List<Etudiant> findByNomEtContaining(String nomEt);
    List<Etudiant> findByNomEtContains(String nomEt);

    Etudiant findByNomAndPrenom(String nom, String prenom);

    Etudiant findByCinAndNomE(long cin, String nomE);

    List<Etudiant> findByNaissanceAfter(LocalDate date);

    List<Etudiant> findByEcole(String ecole);

    List<Etudiant> findByReservations_Id(Long reservationId);

    List<Etudiant> findByReservations_Annee(int annee);

    List<Etudiant> findByEcoleAndNaissanceAfter(String ecole, LocalDate date);

    List<Etudiant> findByReservations_AnneeOrderByNaissance(int annee);


}
