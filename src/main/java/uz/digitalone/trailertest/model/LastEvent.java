package uz.digitalone.trailertest.model;

public class LastEvent
{
    private String messageDate;

    public String sensorType;

    public String sensorData;

    public LastEvent() {
    }

    public void setMessageDate(String messageDate){
        this.messageDate = messageDate;
    }
    public String getMessageDate(){
        return this.messageDate;
    }

    public String getSensorType() {
        return sensorType;
    }

    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }

    public String getSensorData() {
        return sensorData;
    }

    public void setSensorData(String sensorData) {
        this.sensorData = sensorData;
    }
}