package tn.esprit.spring.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.DAO.Entities.Bloc;
import tn.esprit.spring.DAO.Entities.Foyer;
import tn.esprit.spring.DAO.Entities.TypeChambre;

import java.util.List;

public interface FoyerRepository extends JpaRepository<Foyer,Long> {
    Foyer findByNomFoyer(String nom);

    // select * from Foyer capaciterFoyer> ...
    List<Foyer> findByCapaciteFoyerGreaterThan(long capaciterFoyer);
    // select * from Foyer capaciterFoyer< ...
    List<Foyer> findByCapaciteFoyerLessThan(long capaciterFoyer);

    // select * from Foyer capaciterFoyer< ... and capaciterFoyer> ...
    List<Foyer>  findByCapaciteFoyerBetween(long capaciterFoyer1, long capaciterFoyer2);

    //Afficher le Foyer de l'universtier dont son nom est passé en parametre
    Foyer findByUniversiteNomUniversite(String nomUniversite);

    //Afficher la liste des Foyers qui ont des chambres de meme type que le type passé en paramètre
    // foyer --> bloc --> chambre
    List<Foyer> findByBlocsChambresTypeC(TypeChambre typeChambre);


//1- Recherche des foyers d'un bloc spécifique
    List<Foyer> findByBlocsIdBloc(long idBloc);
//2- Recherche du foyer par son idFoyer pour un bloc donné
    Foyer findByBlocsFoyerIdFoyer(long idFoyer);
//3- Recherche des foyers d'un bloc ayant une capacité spécifique
    List<Foyer> findByBlocsCapaciteBloc(long capacite);
//4- Recherche du foyer d'un bloc spécifique dans une université donnée
    Foyer findByBlocsIdBlocAndUniversiteIdUniversite(long idBloc, long idUniversite);
}
