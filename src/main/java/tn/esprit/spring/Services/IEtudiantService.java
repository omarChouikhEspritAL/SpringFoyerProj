package tn.esprit.spring.Services;

import tn.esprit.spring.DAO.Entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
    Etudiant addEtudiant(Etudiant e);

    List<Etudiant> addAllEtudiants(List<Etudiant> etudiants);

    Etudiant updateEtudiant(Etudiant e);

    List<Etudiant> findAllEtudiants();

    Etudiant findEtudiantById(long id);

    void deleteEtudiant(Etudiant e);

    void deleteEtudiantById(long id);
}
