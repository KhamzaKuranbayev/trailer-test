package uz.digitalone.trailertest.service;


import uz.digitalone.trailertest.entity.Trailer;

import java.util.List;

public interface TrailerService {

    List<Trailer> get();

    Trailer getById(Integer id);
}
