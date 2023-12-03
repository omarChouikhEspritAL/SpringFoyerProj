package tn.esprit.spring.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.DAO.Entities.Reservation;
import tn.esprit.spring.Services.IReservationService;

import java.util.List;

@RestController
@AllArgsConstructor
public class ReservationRestController {
    IReservationService iReservationService;

    @GetMapping("getAllReservations")
    public List<Reservation> getAll() {
        return iReservationService.findAllReservations();
    }

    @GetMapping("getReservationById")
    public Reservation getById(@RequestParam String id) {
        return iReservationService.findReservationById(id);
    }

    @PostMapping("addReservation")
    public Reservation addChmbre(@RequestBody Reservation reservation) {
        return iReservationService.addReservation(reservation);
    }

    @PostMapping("addAllReservation")
    public List<Reservation> addAllChambres(@RequestBody List<Reservation> reservations) {
        return iReservationService.addAllReservations(reservations);
    }
}
