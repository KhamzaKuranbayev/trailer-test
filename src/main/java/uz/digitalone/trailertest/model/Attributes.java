package uz.digitalone.trailertest.model;

import lombok.Data;

@Data
public class Attributes {

    public String distance;
    public double latitude;
    public String powerSource;
    public Landmark[] landmarks;
    public String idleTime;
    public String speed;
    public String lastPingDate;
    public LandmarksNear[] landmarksNear;
    public String batteryState;
    public boolean useHeatIndex;
    public String trailerName;
    public SensorsState sensorsState;
    public double longitude;
    public String motionStatus;
    public TrailerAlerts trailerAlerts;
    public String landmarkTrailerState;
    public int noOfAxle;
    public Group[] groups;
    public Object[] trailerTires;
    public int noOfStemcoAxle;
    public int lodsSelfCanceled;
    public LastEvent lastEvent;
    public double batteryPercentage;
    public String location;
    public int trailerId;
    public String trailerState;
    public String roadReadyDate;
    public String roadReadyStatus;


}
