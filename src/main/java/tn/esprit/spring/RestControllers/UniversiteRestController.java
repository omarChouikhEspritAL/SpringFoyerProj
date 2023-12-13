package tn.esprit.spring.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.DAO.Entities.Universite;
import tn.esprit.spring.Services.IUniversiteService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/universite/")
public class UniversiteRestController {
    IUniversiteService iUniversiteService;

    @GetMapping("getAll")
    public List<Universite> getAll() {
        return iUniversiteService.findAllUniversites();
    }

    @GetMapping("getById")
    public Universite getById(@RequestParam long id) {
        return iUniversiteService.findUniversiteById(id);
    }

    @PostMapping("add")
    public Universite addUniversite(@RequestBody Universite universite) {
        return iUniversiteService.addUniversite(universite);
    }

    @PostMapping("addAll")
    public List<Universite> addAllUniversite(@RequestBody List<Universite> universites) {
        return iUniversiteService.addAllUniversites(universites);
    }
}
