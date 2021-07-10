package uz.digitalone.trailertest.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LandMark {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

}

