package uz.digitalone.trailertest.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import uz.digitalone.trailertest.entity.Trailer;

import java.util.List;

public interface TrailerRepository extends JpaRepository<Trailer, Integer> {

    List<Trailer> getAll(Pageable pageable);

    Trailer getByTrailerId(Long id);
}
