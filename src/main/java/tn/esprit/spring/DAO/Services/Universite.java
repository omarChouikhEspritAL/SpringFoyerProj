package tn.esprit.spring.DAO.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.DAO.Repository.UniversiterRepository;

@Service
@AllArgsConstructor
public class Universite implements IUniversiterService{
    UniversiterRepository universiterRepository;
}
