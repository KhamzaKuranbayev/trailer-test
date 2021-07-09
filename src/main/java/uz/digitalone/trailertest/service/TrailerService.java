package uz.digitalone.trailertest.service;


import uz.digitalone.trailertest.entity.Trailer;
import uz.digitalone.trailertest.rest.response.TrailerResponse;

import java.util.List;

public interface TrailerService {

    List<Trailer> get();

    Trailer getById(Integer id);
}
