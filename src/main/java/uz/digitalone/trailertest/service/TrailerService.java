package uz.digitalone.trailertest.service;


import org.springframework.data.domain.Page;
import uz.digitalone.trailertest.entity.Trailer;

import java.util.List;

public interface TrailerService {

    List<Trailer> getAll(Integer pageNumber, Integer size);

    Trailer getById(Integer id);

    Trailer findByTrailerId(Long id);

    Trailer getByLocation(String location);

    Page<Trailer> findFiltered(String vendor, String trailerNumber, String lat,
                               String lang, String lastUpdate, String trailerType, String motion);

}
