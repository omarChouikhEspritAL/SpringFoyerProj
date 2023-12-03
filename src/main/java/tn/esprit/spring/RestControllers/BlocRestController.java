package tn.esprit.spring.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.DAO.Entities.Bloc;
import tn.esprit.spring.Services.IBlocService;

import java.util.List;

@RestController
@AllArgsConstructor
public class BlocRestController {
    IBlocService iBlocService;

    @GetMapping("getAllBlocs")
    public List<Bloc> getAll() {
        return iBlocService.findAllBlocs();
    }

    @PostMapping("addBloc")
    public Bloc addBloc(@RequestBody Bloc b) {
        return iBlocService.addBloc(b);
    }

    @PostMapping("addAllBlocs")
    public List<Bloc> addAllBlocs(@RequestBody List<Bloc> blocs) {
        return iBlocService.addAllBlocs(blocs);
    }

    @GetMapping("getBlocById")
    public Bloc getById(@RequestParam long id) {
        return iBlocService.findBlocById(id);
    }

    @GetMapping("getByIdP/{id}")
    public Bloc getByIdP(@PathVariable long id) {
        return iBlocService.findBlocById(id);
    }
}
