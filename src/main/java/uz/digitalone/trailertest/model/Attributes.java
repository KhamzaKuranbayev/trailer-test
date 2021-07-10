package uz.digitalone.trailertest.model;

import lombok.Data;

import java.util.List;

@Data
public class Attributes {

    public String distance;
    public double latitude;
    public String powerSource;
    public List<Landmark> landmarks;
    public String idleTime;
    public String speed;
    public String lastPingDate;
    public List<LandmarksNear> landmarksNear;
    public String batteryState;
    public boolean useHeatIndex;
    public String trailerName;
    public SensorsState sensorsState;
    public double longitude;
    public String motionStatus;
    public TrailerAlerts trailerAlerts;
    public String landmarkTrailerState;
    public int noOfAxle;
    public List<Group> groups;
    public List<Object> trailerTires;
    public int noOfStemcoAxle;
    public int lodsSelfCanceled;
    public LastEvent lastEvent;
    public double batteryPercentage;
    public String location;
    public Long trailerId;
    public String trailerState;
    public String roadReadyDate;
    public String roadReadyStatus;


}
