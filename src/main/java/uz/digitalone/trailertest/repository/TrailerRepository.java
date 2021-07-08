package uz.digitalone.trailertest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.digitalone.trailertest.entity.Trailer;

public interface TrailerRepository extends JpaRepository<Trailer, Integer> {

}
