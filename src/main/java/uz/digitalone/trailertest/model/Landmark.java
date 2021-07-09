package uz.digitalone.trailertest.model;

public class Landmark {
    private int id;

    private String name;

    public Landmark() {
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
