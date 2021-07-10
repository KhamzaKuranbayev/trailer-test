package uz.digitalone.trailertest.model;

public class Landmark {

    private Long id;
    private String name;

    public Landmark() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
