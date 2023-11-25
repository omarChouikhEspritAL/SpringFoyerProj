package tn.esprit.spring.DAO.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.DAO.Repository.BlocRepository;

@Service //Définir que c'est un bean Spring
@AllArgsConstructor //Pour injecter un bean spring dans un autre bean
public class BlocService implements IBlocService{
    BlocRepository blocRepository;
}
