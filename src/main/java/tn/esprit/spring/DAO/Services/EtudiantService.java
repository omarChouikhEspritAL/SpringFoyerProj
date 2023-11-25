package tn.esprit.spring.DAO.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.DAO.Repository.EtudiantRepository;

@Service
@AllArgsConstructor
public class EtudiantService implements IEtudiantService{
    EtudiantRepository etudiantRepository;
}
