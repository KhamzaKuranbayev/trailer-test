package uz.digitalone.trailertest.service;

import uz.digitalone.trailertest.entity.RoadReady;


import java.util.List;

public interface RoadReadyService {

    List<RoadReady> get();

    RoadReady getById(Integer id);

}
