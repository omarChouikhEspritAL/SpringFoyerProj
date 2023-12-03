package tn.esprit.spring.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.DAO.Entities.Chambre;
import tn.esprit.spring.Services.IChambreService;

import java.util.List;

@RestController
@AllArgsConstructor
public class ChambreRestController {
    IChambreService iChambreService;

    @GetMapping("getAllChambre")
    public List<Chambre> getAll() {
        return iChambreService.findAllChambres();
    }

    @GetMapping("getChambreById")
    public Chambre getById(@RequestParam long id) {
        return iChambreService.findChambreById(id);
    }

    @PostMapping("addChambre")
    public Chambre addChambre(@RequestBody Chambre chambre) {
        return iChambreService.addChambre(chambre);
    }

    @PostMapping("addAllChambres")
    public List<Chambre> addAllChambres(@RequestBody List<Chambre> chambres) {
        return iChambreService.addAllChambres(chambres);
    }

}
