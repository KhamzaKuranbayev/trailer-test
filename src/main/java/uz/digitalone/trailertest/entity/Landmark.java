package uz.digitalone.trailertest.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class Landmark {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @ToString.Exclude
    private Trailer trailer;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Landmark landmark = (Landmark) o;

        return Objects.equals(id, landmark.id);
    }

    @Override
    public int hashCode() {
        return 1592111525;
    }
}