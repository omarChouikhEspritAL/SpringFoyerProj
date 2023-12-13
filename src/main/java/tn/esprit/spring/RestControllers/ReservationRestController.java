package tn.esprit.spring.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.DAO.Entities.Reservation;
import tn.esprit.spring.Services.IReservationService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation/")
public class ReservationRestController {
    IReservationService iReservationService;

    @GetMapping("getAll")
    public List<Reservation> getAll() {
        return iReservationService.findAllReservations();
    }

    @GetMapping("getById")
    public Reservation getById(@RequestParam String id) {
        return iReservationService.findReservationById(id);
    }

    @PostMapping("add")
    public Reservation addChmbre(@RequestBody Reservation reservation) {
        return iReservationService.addReservation(reservation);
    }

    @PostMapping("addAll")
    public List<Reservation> addAllChambres(@RequestBody List<Reservation> reservations) {
        return iReservationService.addAllReservations(reservations);
    }
}
