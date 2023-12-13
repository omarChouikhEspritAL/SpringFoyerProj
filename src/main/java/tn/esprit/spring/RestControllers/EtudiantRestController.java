package tn.esprit.spring.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.DAO.Entities.Etudiant;
import tn.esprit.spring.Services.IEtudiantService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant/")
public class EtudiantRestController {
    IEtudiantService iEtudiantService;

    @GetMapping("getAll")
    public List<Etudiant> getAll() {
        return iEtudiantService.findAllEtudiants();
    }

    @GetMapping("getById")
    public Etudiant getById(@RequestParam long id) {
        return iEtudiantService.findEtudiantById(id);
    }

    @PostMapping("add")
    public Etudiant addChmbre(@RequestBody Etudiant etudiant) {
        return iEtudiantService.addEtudiant(etudiant);
    }

    @PostMapping("addAll")
    public List<Etudiant> addAllEtudiants(@RequestBody List<Etudiant> etudiants) {
        return iEtudiantService.addAllEtudiants(etudiants);
    }
}
