package uz.digitalone.trailertest.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import uz.digitalone.trailertest.entity.Trailer;
import uz.digitalone.trailertest.repository.TrailerRepository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedList;
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

    @Override
    public Page<Trailer> findFiltered(String vendor, String trailerNumber, Double lat, Double lang,
                                      Instant lastUpdate, String trailerType, String motion, Pageable pageable) {
        return trailerRepository.findAll(getFilterSpecification(vendor, trailerNumber, lat, lang, lastUpdate, trailerType, motion), pageable);
    }

    private static Specification<Trailer> getFilterSpecification(
            final String vendor,
            final String trailerName,
            final Double lat,
            final Double lang,
            final Instant lastUpdate,
            final String trailerType,
            final String motion) {

        return (root, criteriaQuery, criteriaBuilder) -> {

            List<Predicate> predicates = new LinkedList<>();

            if (trailerName != null) {
                predicates.add(criteriaBuilder.like(root.get("trailerName"), "%" + trailerName + "%"));
            }

            if (lat != null) {
                predicates.add(criteriaBuilder.equal(root.get("latitude"), lat));
            }

            if (lang != null) {
                predicates.add(criteriaBuilder.equal(root.get("longitude"), lang));
            }

            if (lastUpdate != null) {
                predicates.add(criteriaBuilder.greaterThanOrEqualTo(root.get("lastPingDate"), lastUpdate));
            }

            if (trailerType != null) {
                predicates.add(criteriaBuilder.like(root.get("type"), "%" + trailerType + "%"));
            }

            if (motion != null) {
                predicates.add(criteriaBuilder.like(root.get("motionStatus"), "%" + motion + "%"));
            }

            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        };
    }


}
