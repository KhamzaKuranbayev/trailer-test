package uz.digitalone.trailertest.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Trailer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String type;

    private Long uniqueId;

    public String distance;

    private Double latitude;

    private String powerSource;

    @OneToMany
    private List<LandMark> landMarks;

    private String idleTime;

    private String speed;

    private Timestamp lastPingDate;

    @OneToMany
    private List<LandMark> landMarksNear;

    private String batteryState;

    private boolean useHeatIndex;

    private String trailerName;

    private Double longitude;

    private String motionStatus;

    private String landmarkTrailerState;

    @OneToMany
    private List<Group> groups;

    private Timestamp lastEventMessageDate;

    private Double batteryPercentage;

    private String location;

    private Long trailerId;

    private String trailerState;
}
