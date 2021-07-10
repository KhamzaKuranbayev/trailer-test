package uz.digitalone.trailertest.model;


import java.util.List;

@lombok.Data
public class Root {

    private List<Data> data;

   private Object[] included;

    private Meta meta;

}
