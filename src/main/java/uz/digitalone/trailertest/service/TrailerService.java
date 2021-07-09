package uz.digitalone.trailertest.service;


import uz.digitalone.trailertest.entity.Trailer;

import java.util.List;

public interface TrailerService {

    List<Trailer> getAll();

    List<Trailer> getAll(int pageNum, int size);

    Trailer getById(Integer id);

    Trailer getByTrailerId(Long id);
}
