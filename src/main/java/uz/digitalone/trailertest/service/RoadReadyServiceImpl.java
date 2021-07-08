package uz.digitalone.trailertest.service;

import org.springframework.stereotype.Service;
import uz.digitalone.trailertest.entity.RoadReady;
import uz.digitalone.trailertest.repository.RoadReadyRepository;

import java.util.List;
import java.util.Optional;

@Service
public class RoadReadyServiceImpl implements RoadReadyService{

    final RoadReadyRepository roadReadyRepository;

    public RoadReadyServiceImpl(RoadReadyRepository roadReadyRepository) {
        this.roadReadyRepository = roadReadyRepository;
    }

    @Override
    public List<RoadReady> get() {
        return roadReadyRepository.findAll();
    }

    @Override
    public RoadReady getById(Integer id) {
        final Optional<RoadReady> roadReadyOptional = roadReadyRepository.findById(id);
        if (roadReadyOptional.isEmpty()){
            return null;
        }
        return roadReadyOptional.get();
    }
}
