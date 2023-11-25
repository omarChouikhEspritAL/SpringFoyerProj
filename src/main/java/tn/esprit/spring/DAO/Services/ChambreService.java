package tn.esprit.spring.DAO.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.DAO.Repository.ChambreRepository;

@Service
@AllArgsConstructor
public class ChambreService implements IChambreService{
    ChambreRepository chambreRepository;
}
