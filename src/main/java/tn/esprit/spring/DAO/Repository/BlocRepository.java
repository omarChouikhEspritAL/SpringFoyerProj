package tn.esprit.spring.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.DAO.Entities.Bloc;

public interface BlocRepository extends JpaRepository<Bloc,Long> {
}
