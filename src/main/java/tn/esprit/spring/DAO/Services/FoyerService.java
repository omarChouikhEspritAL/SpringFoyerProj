package tn.esprit.spring.DAO.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.DAO.Repository.FoyerRepository;

@Service
@AllArgsConstructor
public class FoyerService implements IFoyerService {
    FoyerRepository foyerRepository;
}
