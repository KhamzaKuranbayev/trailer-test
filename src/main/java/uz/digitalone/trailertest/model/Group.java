package uz.digitalone.trailertest.model;

public class Group
{
    private String name;

    private boolean fleet;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setFleet(boolean fleet){
        this.fleet = fleet;
    }
    public boolean getFleet(){
        return this.fleet;
    }
}
