package tn.esprit.spring.Services;

import tn.esprit.spring.DAO.Entities.Bloc;

import java.util.List;

public interface IBlocService {
    Bloc addBloc(Bloc b);

    List<Bloc> addAllBlocs(List<Bloc> blocs);

    Bloc updateBloc(Bloc b);

    List<Bloc> findAllBlocs();

    Bloc findBlocById(long id);

    void deleteBloc(Bloc b);

    void deleteBlocById(long id);
}
