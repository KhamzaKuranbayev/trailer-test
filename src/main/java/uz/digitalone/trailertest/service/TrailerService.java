package uz.digitalone.trailertest.service;


import uz.digitalone.trailertest.entity.Trailer;

import java.util.List;

public interface TrailerService {

    List<Trailer> getAll(Integer pageNumber, Integer size);

    Trailer getById(Integer id);

    Trailer findByTrailerId(Long id);

    Trailer getByLocation(String location);

}
