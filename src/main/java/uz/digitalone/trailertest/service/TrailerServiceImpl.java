package uz.digitalone.trailertest.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import uz.digitalone.trailertest.entity.Trailer;
import uz.digitalone.trailertest.repository.TrailerRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TrailerServiceImpl implements TrailerService {

    final TrailerRepository trailerRepository;

    public TrailerServiceImpl(TrailerRepository trailerRepository) {
        this.trailerRepository = trailerRepository;
    }

    @Override
    public List<Trailer> getAll(Integer pageNum, Integer size) {
        final Pageable page = PageRequest.of(pageNum, size);
        Page<Trailer> all = trailerRepository.findAll(page);
        List<Trailer> trailerList = all.toList();
        return trailerList;
    }

    @Override
    public Trailer getById(Integer id) {
        return null;
    }

    @Override
    public Trailer getByLocation(String location) {
        return null;
    }

    @Override
    public Trailer findByTrailerId(Long id) {
        final Optional<Trailer> optionalTrailer = trailerRepository.findByTrailerId(id);
        if (optionalTrailer.isEmpty()) {
            return null;
        }
        return optionalTrailer.get();
    }


}
