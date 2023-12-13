package tn.esprit.spring.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.DAO.Entities.Bloc;
import tn.esprit.spring.DAO.Entities.Universite;

import java.util.List;

public interface BlocRepository extends JpaRepository<Bloc,Long> {


    //1- Recherche par nomBloc
// SELECT * FOM BLOC WHERE nomBloc = ...
    Bloc findBlocByNomBloc(String nomBloc);

    Bloc getByNomBloc(String nomBloc);

    //2- Recherche par capaciteBloc
    List<Bloc> findByCapaciteBloc(long capaciteBloc);

    //3- Recherche par nomBloc et capaciteBloc
// SELECT * FOM BLOC WHERE nomBloc = ... and capaciterBloc = ...
    Bloc findByNomBlocAndCapaciteBloc(String nomBloc, long capaciteBloc);

    //4- Recherche par nomBloc en ignorant la casse
    Bloc findByNomBlocIgnoreCase(String nomBloc);

    //5- Recherche par capaciteBloc supérieure à une valeur donnée
    List<Bloc> findByCapaciteBlocGreaterThan(long capaciteBloc);

    //6- Recherche par nomBloc contenant une sous-chaîne
    List<Bloc> findByNomBlocLike(String sousChaine);

    //7- Tri par nomBloc par ordre alphabétique
    List<Bloc> findAllByOrderByNomBloc();

    //8- Recherche par nomBloc ou capaciteBloc
// SELECT * FOM BLOC WHERE nomBloc = ... Or capaciterBloc = ...
    Bloc findByNomBlocOrCapaciteBloc(String nomBloc, long capaciteBloc);

    //9- Recherche du bloc d'un foyer spécifique
    List<Bloc> findByFoyerNomFoyer(String nomFoyer);

    //10- Recherche du bloc pour un foyer d'une université donnée
    List<Bloc> findByFoyerUniversiteIdUniversite(long idUniversite);

}
