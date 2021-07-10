package uz.digitalone.trailertest.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.Instant;
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

    private String uniqueId;

    private String type;

    public String distance;

    private Double latitude;

    private String powerSource;

    private String idleTime;

    private String speed;

    private String lastPingDate;

    private String batteryState;

    private boolean useHeatIndex;

    private String trailerName;

    private Double longitude;

    private String motionStatus;

    private String landmarkTrailerState;

    private String lastEventMessageDate;

    private Double batteryPercentage;

    private String location;

    private Long trailerId;

    private String trailerState;

    public Trailer(String uniqueId, String type, String distance, Double latitude, String powerSource, String idleTime, String speed, String lastPingDate, String batteryState, boolean useHeatIndex, String trailerName, Double longitude, String motionStatus, String landmarkTrailerState, String lastEventMessageDate, Double batteryPercentage, String location, Long trailerId, String trailerState) {
        this.uniqueId = uniqueId;
        this.type = type;
        this.distance = distance;
        this.latitude = latitude;
        this.powerSource = powerSource;
        this.idleTime = idleTime;
        this.speed = speed;
        this.lastPingDate = lastPingDate;
        this.batteryState = batteryState;
        this.useHeatIndex = useHeatIndex;
        this.trailerName = trailerName;
        this.longitude = longitude;
        this.motionStatus = motionStatus;
        this.landmarkTrailerState = landmarkTrailerState;
        this.lastEventMessageDate = lastEventMessageDate;
        this.batteryPercentage = batteryPercentage;
        this.location = location;
        this.trailerId = trailerId;
        this.trailerState = trailerState;
    }
}
