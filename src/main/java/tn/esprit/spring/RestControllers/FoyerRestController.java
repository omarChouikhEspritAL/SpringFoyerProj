package tn.esprit.spring.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.DAO.Entities.Foyer;
import tn.esprit.spring.Services.IFoyerService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/foyer/")
public class FoyerRestController {
    IFoyerService iFoyerService;

    @GetMapping("getAll")
    public List<Foyer> getAll() {
        return iFoyerService.findAllFoyers();
    }

    @GetMapping("getById")
    public Foyer getById(@RequestParam long id) {
        return iFoyerService.findFoyerById(id);
    }

    @PostMapping("add")
    public Foyer addChmbre(@RequestBody Foyer foyer) {
        return iFoyerService.addFoyer(foyer);
    }

    @PostMapping("addAll")
    public List<Foyer> addAllFoyers(@RequestBody List<Foyer> foyers) {
        return iFoyerService.addAllFoyers(foyers);
    }
}
