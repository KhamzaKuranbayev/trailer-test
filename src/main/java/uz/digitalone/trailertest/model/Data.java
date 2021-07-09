package uz.digitalone.trailertest.model;

public class Data
{
    private String type;

    private String id;

    private Attributes attributes;

    private Relationships relationships;

    private Links links;

    public Data() {
    }

    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public void setAttributes(Attributes attributes){
        this.attributes = attributes;
    }
    public Attributes getAttributes(){
        return this.attributes;
    }
    public void setRelationships(Relationships relationships){
        this.relationships = relationships;
    }
    public Relationships getRelationships(){
        return this.relationships;
    }
    public void setLinks(Links links){
        this.links = links;
    }
    public Links getLinks(){
        return this.links;
    }


}
