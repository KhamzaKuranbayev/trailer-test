package uz.digitalone.trailertest.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class LandmarksNear {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    public String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @ToString.Exclude
    private Trailer trailer;
}