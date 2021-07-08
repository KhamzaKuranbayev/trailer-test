package uz.digitalone.trailertest.service;

import org.springframework.stereotype.Service;
import uz.digitalone.trailertest.entity.Trailer;
import uz.digitalone.trailertest.repository.TrailerRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TrailerServiceImpl implements TrailerService{

    final TrailerRepository trailerRepository;

    public TrailerServiceImpl(TrailerRepository trailerRepository) {
        this.trailerRepository = trailerRepository;
    }

    @Override
    public List<Trailer> get() {
        return trailerRepository.findAll();
    }

    @Override
    public Trailer getById(Integer id) {
        final Optional<Trailer> trailerOptional = trailerRepository.findById(id);
        if (trailerOptional.isEmpty()){
            return null;
        }
        return trailerOptional.get();
    }
}
