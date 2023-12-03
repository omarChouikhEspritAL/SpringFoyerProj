package tn.esprit.spring.Services;

import tn.esprit.spring.DAO.Entities.Chambre;

import java.util.List;

public interface IChambreService {
        Chambre addChambre(Chambre c);

        List<Chambre> addAllChambres(List<Chambre> chambres);

        Chambre updateChambre(Chambre c);

        List<Chambre> findAllChambres();

        Chambre findChambreById(long id);

        void deleteChambre(Chambre c);

        void deleteChambreById(long id);
}
