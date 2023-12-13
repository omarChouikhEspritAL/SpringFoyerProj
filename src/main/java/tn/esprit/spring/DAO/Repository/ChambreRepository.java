package tn.esprit.spring.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.DAO.Entities.Chambre;
import tn.esprit.spring.DAO.Entities.TypeChambre;

import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {
//    1- Recherche par numéro de chambre
    Chambre findByNumeroChambre(long numChambre);
//2- Recherche par type de chambre
    List<Chambre> findByTypeC(TypeChambre typeChambre);
//3- Recherche des chambres par bloc
    List<Chambre> findByBlocIdBloc(long idBloc);
    // 4- Recherche des chambres par bloc et type de chambre
    List<Chambre> findByBlocIdBlocAndTypeC(long id_bloc , TypeChambre typeChambre);

    // 5- Recherche des chambres par numéro de chambre et type de chambre
    Chambre findByNumeroChambreAndTypeChambre(String numeroChambre, TypeChambre typeChambre);

    // 6- Récupérer des chambres en filtrant par le nom de l'université associée au foyer, l'année de réservation,
    List<Chambre> findByBlocFoyerUniversiteNomUniversiteAndReservationsAnneeAndReservationsEtudiantNomAndNumeroChambre(
            String nomUniversite, int annee, String nomEtudiant, String numeroChambre);
}


