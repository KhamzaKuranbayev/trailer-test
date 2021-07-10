package uz.digitalone.trailertest.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import uz.digitalone.trailertest.entity.Trailer;

import java.time.Instant;
import java.util.List;

public interface TrailerService {

    List<Trailer> getAll(Integer pageNumber, Integer size);

    Trailer getById(Integer id);

    Trailer findByTrailerId(Long id);

    Trailer getByLocation(String location);

    Page<Trailer> findFiltered(String vendor, String trailerNumber, Double lat,
                               Double lang, Instant lastUpdate, String trailerType, String motion, Pageable pageable);

}
