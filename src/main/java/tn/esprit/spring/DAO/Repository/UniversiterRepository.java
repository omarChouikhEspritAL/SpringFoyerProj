package tn.esprit.spring.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.DAO.Entities.Universite;

public interface UniversiterRepository extends JpaRepository<Universite,Long> {
}
