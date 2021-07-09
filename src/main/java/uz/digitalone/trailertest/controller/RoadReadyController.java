package uz.digitalone.trailertest.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.digitalone.trailertest.entity.RoadReady;
import uz.digitalone.trailertest.entity.Trailer;
import uz.digitalone.trailertest.service.RoadReadyService;
import uz.digitalone.trailertest.service.TrailerService;

import java.util.List;

@RestController
@RequestMapping(value = "/api/roadReady")
public class RoadReadyController {

    @Autowired
    private RoadReadyService roadReadyService;


    @GetMapping
    public List<RoadReady> get() {
        return roadReadyService.get();
    }

    @GetMapping("/{id}")
    public RoadReady getById(@PathVariable Integer id) {
        return roadReadyService.getById(id);
    }

}
