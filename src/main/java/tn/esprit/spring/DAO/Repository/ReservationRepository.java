package tn.esprit.spring.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.DAO.Entities.Reservation;

import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation,String> {
    // 1- Recherche des réservations validées
    List<Reservation> findByValidatedTrue();

    // 2- Recherche des réservations par l'id de l'étudiant
    List<Reservation> findByEtudiantsId(long etudiantId);

    // 3- Recherche des réservations par année et validité
    List<Reservation> findByAnneUniversitaireAndValidatedTrue(int year);

}
