package tn.esprit.spring.Services;

import tn.esprit.spring.DAO.Entities.Universite;

import java.util.List;

public interface IUniversiteService {
    Universite addUniversite(Universite u);

    List<Universite> addAllUniversites(List<Universite> universites);

    Universite updateUniversite(Universite u);

    List<Universite> findAllUniversites();

    Universite findUniversiteById(long id);

    void deleteUniversite(Universite u);

    void deleteUniversiteById(long id);
}
