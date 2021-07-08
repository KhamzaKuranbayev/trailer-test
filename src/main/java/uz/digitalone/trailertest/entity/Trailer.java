package uz.digitalone.trailertest.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Trailer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public String distance;

    private Double latitude;

    private String powerSource;

    private String idleTime;

    private String speed;

    private Timestamp lastPingDate;

    private String batteryState;

    private boolean useHeatIndex;

    private String trailerName;

    private Double longitude;

    private String motionStatus;

    private String landmarkTrailerState;

    private Integer noOfAxle;

    private String groupName;

    private boolean groupFeet;

    private Integer noOfStemcoAxle;

    private Integer loadsSelfCanceled;

    private Timestamp lastEventMessageDate;

    private Double batteryPercentage;

    private String location;

    private Integer trailerId;

    private String trailerState;
}
