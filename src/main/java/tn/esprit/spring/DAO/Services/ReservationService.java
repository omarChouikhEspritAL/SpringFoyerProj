package tn.esprit.spring.DAO.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.DAO.Repository.ReservationRepository;

@Service
@AllArgsConstructor
public class ReservationService implements IReservationService{
    ReservationRepository reservationRepository;
}
