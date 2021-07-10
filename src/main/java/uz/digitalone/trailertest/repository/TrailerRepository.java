package uz.digitalone.trailertest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import uz.digitalone.trailertest.entity.Trailer;

import java.util.Optional;

public interface TrailerRepository extends JpaRepository<Trailer, Integer>, JpaSpecificationExecutor<Trailer> {

    Optional<Trailer> findByTrailerId(Long id);

    Optional<Trailer> findByLocation(String location);
}
